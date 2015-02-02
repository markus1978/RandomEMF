package de.hub.randomemf.jvmmodel

import com.google.inject.Inject
import de.hub.randomemf.randomEMF.ClassRule
import de.hub.randomemf.randomEMF.FeatureRule
import de.hub.randomemf.randomEMF.Generator
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class RandomEMFJvmModelInferrer extends AbstractModelInferrer {

    /**
     * convenience API to build and initialize JVM types and their members.
     */
	@Inject extension JvmTypesBuilder
	@Inject extension GenModelHelper
	@Inject TypeReferences typeReferences

   	def dispatch void infer(Generator element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(element.toClass(element.name.get(0))) [
				for (classRule: element.rules) {				
					for (index: 0..classRule.rules.size-1) {
						val featureRule = classRule.rules.get(index)
						members += featureRule.toMethod(featureRule.syntheticFeaturRuleExprName('expr', index), featureRule.EFeature.EType.jvmType) [
							for (param : classRule.params) {
								parameters += param.toParameter(param.name, param.parameterType)
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
						for (param : classRule.params) {
							parameters += param.toParameter(param.name, param.parameterType)
						}
						body = '''
							«classRule.EClass.jvmType.identifier» result = «classRule.EClass.EFactoryInterfaceName».eINSTANCE.create«classRule.EClass.name.toFirstUpper»();
							«FOR index:0..classRule.rules.size-1»
								«val featureRule = classRule.rules.get(index)»
								«IF (!featureRule.isAddRule)»
									result.eSet(result.eClass().getEStructuralFeature(«featureRule.EFeature.featureID»), «featureRule.callSyntheticFeaturRuleExpr('expr', index)»);		
								«ELSE»	
									{								
										org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)result.eGet(result.eClass().getEStructuralFeature(«featureRule.EFeature.featureID»));
										«IF featureRule.multiplicityExpr == null»											
											values.add(«featureRule.callSyntheticFeaturRuleExpr('expr', index)»);
										«ELSE»	
											int iterations = «featureRule.callSyntheticFeaturRuleExpr('multiExpr', index)»;
											for (int i = 0; i < iterations; i++) {
												values.add(«featureRule.callSyntheticFeaturRuleExpr('expr', index)»);
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
   	
   	def jvmType(EClassifier classifier) {   		
   		return typeReferences.getTypeForName(classifier.javaInterfaceName, classifier, null)
   	}
   	
   	def callSyntheticFeaturRuleExpr(FeatureRule rule, String ext, int index) {
   		return '''«rule.syntheticFeaturRuleExprName(ext, index)»(«FOR p:(rule.eContainer as ClassRule).params SEPARATOR ', '»«p.name»«ENDFOR»)'''
   	}
   	
   	def syntheticFeaturRuleExprName(FeatureRule rule, String ext, int index) {
   		return '''_«(rule.eContainer as ClassRule).name»_«rule.EFeature.name»_«ext»«index»'''.toString   		
   	}
}



