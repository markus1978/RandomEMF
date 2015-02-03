package de.hub.randomemf.jvmmodel

import com.google.inject.Inject
import de.hub.randomemf.randomEMF.ClassRule
import de.hub.randomemf.randomEMF.FeatureRule
import de.hub.randomemf.randomEMF.Generator
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import de.hub.randomemf.runtime.IGenerator
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.EcorePackage

class RandomEMFJvmModelInferrer extends AbstractModelInferrer {

    /**
     * convenience API to build and initialize JVM types and their members.
     */
	@Inject extension JvmTypesBuilder
	@Inject extension GenModelHelper
	@Inject TypeReferences typeReferences

   	def dispatch void infer(Generator element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		val simpleName = element.name
   		val qualifiedName = if(element.getPackage != null)  element.getPackage + "." + simpleName else simpleName
		acceptor.accept(element.toClass(qualifiedName)) [
			superTypes += typeRef(IGenerator)
			members += element.toField("model", jvmType(element.rules.get(0).EClass));
						
			members += element.toMethod("generate", element.rules.get(0).EClass.jvmType) [
				body = '''
					«element.rules.get(0).name»();
					de.hub.randomemf.runtime.References.resolveReferences(this, model);
					return model;
				'''
			]
			
			members += element.toMethod("resolve", typeRef(EObject)) [
				parameters += element.toParameter("proxy", typeRef(EObject))
				annotations += element.toAnnotation(Override)
				body = '''
					if (proxy == null) return null;
					String uri = ((org.eclipse.emf.ecore.InternalEObject)proxy).eProxyURI().toString();
					«FOR classRule: element.rules»
						«FOR index:0..classRule.rules.size-1»
							«val featureRule = classRule.rules.get(index)»
							«IF featureRule.EFeature instanceof EReference && !(featureRule.EFeature as EReference).containment»
								if (uri.equals("«featureRule.syntheticFeaturRuleExprName('expr', index)»")) {
									return «featureRule.callSyntheticFeaturRuleExpr('expr', index)»;
								}
							«ENDIF»
						«ENDFOR»
					«ENDFOR»
					return null;
				'''
			]
			
			for (classRule: element.rules) {				
				for (index: 0..classRule.rules.size-1) {
					val featureRule = classRule.rules.get(index)
					members += featureRule.toMethod(featureRule.syntheticFeaturRuleExprName('expr', index), featureRule.EFeature.EType.jvmType) [
						if (!featureRule.EFeature.isRef) {
							for (param : classRule.params) {
								parameters += param.toParameter(param.name, param.parameterType)
							}
						}
						visibility = JvmVisibility.PRIVATE;
						body = featureRule.expr	
					]
					if (featureRule.multiplicityExpr != null) {
						members += featureRule.toMethod(featureRule.syntheticFeaturRuleExprName('multiExpr', index), typeRef(Integer)) [
							for (param : classRule.params) {
								parameters += param.toParameter(param.name, param.parameterType)
							}
							visibility = JvmVisibility.PRIVATE;
							body = featureRule.multiplicityExpr	
						]	
					}
				}
				
				members += classRule.toMethod(classRule.name, classRule.EClass.jvmType) [
					visibility = JvmVisibility.PRIVATE;
					for (param : classRule.params) {
						parameters += param.toParameter(param.name, param.parameterType)
					}
					body = '''
						«classRule.EClass.jvmType.identifier» result = «classRule.EClass.EFactoryInterfaceName».eINSTANCE.create«classRule.EClass.name.toFirstUpper»();						
						«IF classRule == element.rules.get(0)»
							model = result;
						«ENDIF»
						«FOR index:0..classRule.rules.size-1»
							«val featureRule = classRule.rules.get(index)»
							«IF (!featureRule.isAddRule)»
								result.eSet(result.eClass().getEStructuralFeature(«featureRule.EFeature.featureID»), «featureRule.generateFeatureRuleCall(index)»);		
							«ELSE»	
								{
									org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)result.eGet(result.eClass().getEStructuralFeature(«featureRule.EFeature.featureID»));
									«IF featureRule.multiplicityExpr == null»											
										values.add(«featureRule.generateFeatureRuleCall(index)»);
									«ELSE»	
										int iterations = «featureRule.callSyntheticFeaturRuleExpr('multiExpr', index)»;
										for (int i = 0; i < iterations; i++) {
											values.add(«featureRule.generateFeatureRuleCall(index)»);
										}
									«ENDIF»
								}
							«ENDIF»							
						«ENDFOR»
						return result;
					'''
				]
			}
		]
   	}
   	
   	def generateFeatureRuleCall(FeatureRule featureRule, int index) {
   		if (featureRule.EFeature.isRef) {
   			var EClass type = featureRule.concreteValueType
   			if (featureRule.concreteValueType == null) {
   				type = featureRule.EFeature.EType as EClass
   			}
 			return '''de.hub.randomemf.runtime.References.createProxy(«(featureRule.EFeature.EType as EClass).EFactoryInterfaceName».eINSTANCE.create«type.name.toFirstUpper»(), "«featureRule.syntheticFeaturRuleExprName('expr', index)»")'''	
   		} else {
   			return '''«featureRule.callSyntheticFeaturRuleExpr('expr', index)»'''
   		}
   	} 
   		
   	
   	def jvmType(EClassifier classifier) {   		
   		return typeReferences.getTypeForName(classifier.javaInterfaceName, classifier, null)
   	}
   	
   	def callSyntheticFeaturRuleExpr(FeatureRule rule, String ext, int index) {
   		return '''«rule.syntheticFeaturRuleExprName(ext, index)»(«IF !rule.EFeature.isRef»«FOR p:(rule.eContainer as ClassRule).params SEPARATOR ', '»«p.name»«ENDFOR»«ENDIF»)'''
   	}
   	
   	def syntheticFeaturRuleExprName(FeatureRule rule, String ext, int index) {
   		return '''_«(rule.eContainer as ClassRule).name»_«rule.EFeature.name»_«ext»«index»'''.toString   		
   	}
   	
   	def isRef(EStructuralFeature feature) {
   		return feature instanceof EReference && !(feature as EReference).containment
   	}
}



