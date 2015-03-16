package de.hub.randomemf.jvmmodel

import com.google.inject.Inject
import de.hub.randomemf.randomEMF.ClassRule
import de.hub.randomemf.randomEMF.Generator
import de.hub.randomemf.randomEMF.InnerRule
import de.hub.randomemf.runtime.IGenerator
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class ClassBasedRandomEMFJvmModelInferrer extends AbstractModelInferrer {

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
			
			// field for the model
			members += element.toField("model", jvmType(element.rules.get(0).EClass));
			members += element.toField("depth", typeRef(Integer)) [ initializer = '''0'''];
			
			members += element.toMethod("generate", element.rules.get(0).EClass.jvmType) [
				body = '''
					«element.rules.get(0).name»();
					de.hub.randomemf.runtime.References.resolveReferences(this, model);
					return model;
				'''
			]
			
			for (rule: element.rules) {
				members += rule.toMethod(rule.name, rule.EClass.jvmType) [
					for (param: rule.params) {
						parameters += param.toParameter(param.name, param.parameterType)	
					}
					body = '''
						depth += 1;
						«rule.EClass.jvmType.identifier» result = new «rule.name.toFirstUpper»(«FOR p:rule.params SEPARATOR ", "»«p.name»«ENDFOR»).generate();
						depth -= 1;
						return result;
					'''
				]
				members += rule.toClass(rule.name.toFirstUpper) [
					visibility = JvmVisibility.PRIVATE
					members += rule.toField("self", rule.EClass.jvmType)
					
					for (param: rule.params) {
						members += param.toField(param.name, param.parameterType)
					}
					
					members += rule.toConstructor [
						for (param: rule.params) {
							parameters += param.toParameter(param.name, param.parameterType)
						}	
						body = '''
							«FOR param: rule.params»
								this.«param.name» = «param.name»;
							«ENDFOR»
						'''
					]
					
					if (!rule.params.empty) {
						members += rule.toConstructor[ body = '''''' ]
					}
					
					for (var i = 0; i < rule.inners.size; i++) {
						val inner = rule.inners.get(i)
						val index = i
						if (inner.EFeature != null) {
							members += inner.toMethod("call_" + index, inner.EFeature.EType.jvmType) [ 
								body = '''
									«IF inner.isRef»
										«val type = if (inner.concreteValueType == null) inner.EFeature.EType as EClass else inner.concreteValueType»
										return de.hub.randomemf.runtime.References.createProxy(«type.EFactoryInterfaceName».eINSTANCE.create«type.name.toFirstUpper»(), "«rule.name»_«index»");	
									«ELSE»
										return callExpr_«index»();
									«ENDIF»
								'''
							]
							members += inner.toMethod("callExpr_" + i, inner.EFeature.EType.jvmType) [ body = inner.expr ]
						} else {
							members += inner.toMethod("call_" + i, rule.EClass.jvmType) [ body = inner.expr ]
						}
						members += inner.toMethod("number_" + i, typeRef(Integer)) [
							if (inner.number == null)  {
								body = '''return 1;'''
							} else {
								body = inner.number
							}
						]
					}
					
					members += rule.toMethod("generate", rule.EClass.jvmType) [
						body = '''
							«IF rule instanceof ClassRule»
								self = «rule.EClass.EFactoryInterfaceName».eINSTANCE.create«rule.EClass.name.toFirstUpper»();
								«IF ((rule.eContainer as Generator).rules.get(0) == rule)»
									model = self;
								«ENDIF»
								«IF !rule.inners.empty»
									«FOR index:0..rule.inners.size-1»
										«val feature = rule.inners.get(index)»
										«IF (!feature.isAddRule)»
											self.eSet(self.eClass().getEStructuralFeature("«feature.EFeature.name»"), call_«index»());		
										«ELSE»	
											{
												org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)self.eGet(self.eClass().getEStructuralFeature("«feature.EFeature.name»"));	
												int iterations = number_«index»();
												for (int i = 0; i < iterations; i++) {
													values.add(call_«index»());
												}
											}
										«ENDIF»							
									«ENDFOR»
								«ENDIF»
								return self;
							«ELSE»
								int sum = 0;
								«FOR index: 0..rule.inners.size-1»
									sum += number_«index»();
								«ENDFOR»
								int draw = Random.RandomInt(sum);
								int current = 0;
								«FOR index: 0..rule.inners.size-1»
									current += number_«index»();
									if (current >= draw) {
										return call_«index»();
									}
								«ENDFOR»
								throw new IllegalStateException("Unreachable!");
							«ENDIF»
						'''	
					]
				]
			}
			
			members += element.toMethod("resolve", typeRef(EObject)) [
				parameters += element.toParameter("proxy", typeRef(EObject))
				annotations += element.toAnnotation(Override)
				body = '''
					if (proxy == null) return null;
					String uri = ((org.eclipse.emf.ecore.InternalEObject)proxy).eProxyURI().toString();
					«FOR rule: element.rules.filter[it instanceof ClassRule]»
						«IF !rule.inners.empty»
							«FOR index:0..rule.inners.size-1»
								«val feature = rule.inners.get(index)»
								«IF feature.EFeature instanceof EReference && !(feature.EFeature as EReference).containment»
									if (uri.equals("«rule.name»_«index»")) {
										return new «rule.name.toFirstUpper»().callExpr_«index»();
									}
								«ENDIF»
							«ENDFOR»
						«ENDIF»
					«ENDFOR»
					return null;
				'''
			]			
		]
   	} 	
   	
   	def jvmType(EClassifier classifier) {   		
   		return typeReferences.getTypeForName(classifier.javaInterfaceName, classifier, null)
   	}
   	
   	def isRef(InnerRule feature) {
   		return feature.isIsRef;
   	}
}



