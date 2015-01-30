package de.hub.randomemf.jvmmodel

import com.google.inject.Inject
import de.hub.randomemf.randomEMF.Generator
import de.hub.randomemf.util.GenModelHelper
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.compiler.ImportManager
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable
import org.eclipse.xtext.xbase.compiler.output.FakeTreeAppendable
import org.eclipse.emf.ecore.EObject

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */ 
class RandomEMFJvmModelInferrer extends AbstractModelInferrer {

    /**
     * convenience API to build and initialize JVM types and their members.
     */
	@Inject extension JvmTypesBuilder
	@Inject extension GenModelHelper
	@Inject TypeReferences typeReferences
	@Inject XbaseCompiler xbaseCompiler

   	def dispatch void infer(Generator element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(element.toClass(element.name.get(0)))
			.initializeLater([
				for (classRule: element.rules) {
					val eClass = classRule.EClass
					val javaInterfaceName = eClass.javaInterfaceName;
					members += classRule.toMethod(classRule.name, typeReferences.getTypeForName(javaInterfaceName, eClass, null)) [
						body = [
							it.append('''
								«javaInterfaceName» result = «eClass.EFactoryInterfaceName».eINSTANCE.create«eClass.name.toFirstUpper»();
								«FOR featureRule:classRule.rules»
									{
										«IF (!featureRule.isAddRule)»
											result.eSet(result.eClass().getEStructuralFeature(«featureRule.EFeature.featureID»), «featureRule.expr.compileExpr(featureRule.EFeature.EType)»);		
										«ELSE»									
											org.eclipse.emf.common.util.EList values = (org.eclipse.emf.common.util.EList)result.eGet(result.eClass().getEStructuralFeature(«featureRule.EFeature.featureID»));
											«IF featureRule.multiplicityExpr == null»											
												values.add(«featureRule.expr.compileExpr(featureRule.EFeature.EType)»);
											«ELSE»	
												int iterations = «featureRule.multiplicityExpr.compileExpr(typeof(Integer), element)»;
												for (int i = 0; i < iterations; i++) {
													values.add(«featureRule.expr.compileExpr(featureRule.EFeature.EType)»);
												}
											«ENDIF»
										«ENDIF»
									}
								«ENDFOR»
								return result;
							''');							
						]
					]
				}
			])
   	}
   	
   	def compileExpr(XExpression expr, EClassifier type) {
   		val appendable = new FakeTreeAppendable();
   		xbaseCompiler.compileAsJavaExpression(expr, appendable, typeReferences.getTypeForName(type.javaInterfaceName, type, null))
   		return appendable.toString();
   	}
   	
   	def compileExpr(XExpression expr, Class clazz, EObject context) {
   		val appendable = new FakeTreeAppendable();
   		xbaseCompiler.compileAsJavaExpression(expr, appendable, typeReferences.getTypeForName(class.canonicalName, context, null))
   		return appendable.toString();
   	}
}

