package de.hub.rcore.example

import de.hub.rcore.example.metrics.JavaMetrics
import java.io.File
import java.io.PrintWriter
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration
import org.eclipse.gmt.modisco.java.AbstractMethodInvocation
import org.eclipse.gmt.modisco.java.BodyDeclaration
import org.eclipse.gmt.modisco.java.Expression
import org.eclipse.gmt.modisco.java.Model
import org.eclipse.gmt.modisco.java.NamedElement
import org.eclipse.gmt.modisco.java.Statement
import org.eclipse.gmt.modisco.java.TypeDeclaration
import org.eclipse.gmt.modisco.java.emf.JavaPackage

class Java2Json {
	def generate() {
		EPackage.Registry.INSTANCE.put(EcorePackage.eINSTANCE.nsURI, EcorePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java", JavaPackage.eINSTANCE);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl);
		
		val rs = new ResourceSetImpl
		val mm = rs.getResource(URI.createURI("model/de.hub.emffrag_java.xmi"), true);
		val model = mm.contents.get(0) as Model
		
//		val pkg = model.ownedElements.findFirst[it.name.equals("de")] as EObject
		
		val pkg = model
			.ownedElements.findFirst[it.name.equals("de")]
			.ownedPackages.findFirst[it.name.equals("hub")]
			.ownedPackages.findFirst[it.name.equals("emffrag")]
			.ownedPackages.findFirst[it.name.equals("fragmentation")]
		
		val java2json = new Java2Json();
		{
			val out = new PrintWriter(new File("model/hierarchy/java.json"))
			out.print(java2json.genHierarchy(pkg))
			out.close
		}
		
		{
			val out = new PrintWriter(new File("model/dependencies/java.json"))
			java2json.genMethodCalls(pkg, out)
			out.close
		}
		
		return new JavaMetrics().metrics(pkg);
	}
	
	def CharSequence genHierarchy(EObject eObject) '''
	{
		"name" : "«eObject.className»"«IF !eObject.eContents.empty»,«ENDIF»
		«IF !eObject.eContents.empty»
			"children": [
				«FOR eChild:eObject.eContents SEPARATOR ","»
					«eChild.genHierarchy»
				«ENDFOR»
			]
		«ENDIF»
	}
	'''
	
	def genMethodCalls(EObject eObject, PrintWriter out) {
		out.print("[")
		val iterator = eObject.eAllContents
		var first = true;
		while (iterator.hasNext) {
			val content = iterator.next
			if (content instanceof AbstractMethodDeclaration) {
				val declaration = content as AbstractMethodDeclaration
				if (first) {
					first = false
				} else {
					out.print(",")
				}
				out.print('''{ "name":"«declaration.methodName»", "size":1, "imports":[''')
				
				if (declaration.body != null) {
					val bodyIterator =  declaration.body.eAllContents
					var bodyFirst = true;
					while (bodyIterator.hasNext) {
						val bodyContent = bodyIterator.next
						if (bodyContent instanceof AbstractMethodInvocation) {
							val invocation = bodyContent as AbstractMethodInvocation
							val called = invocation.method
							val calledName = called.methodName
							if (calledName.startsWith("de.hub.emffrag.fragmentation")) {
								if (bodyFirst) {					
									bodyFirst = false
								} else {
									out.print(",")
								}
								out.print('''"«calledName»"''')
							}
						}
					}
				}
				out.print(''']}''')
			}
		}	
		out.print("]")
	}
	
	
	def className(EObject eObject) {
		if (eObject instanceof TypeDeclaration) {
			return "1"
		} else if (eObject instanceof BodyDeclaration) {
			return "2"
		} else if (eObject instanceof Expression) {
			return "4"
		} else if (eObject instanceof Statement) {
			return "3"
		} else {
			return "5"
		}
	}
	
	def methodName(AbstractMethodDeclaration declaration) {
		var result = ""
		var obj = declaration as EObject
		while (obj != null && obj instanceof NamedElement) {
			result = (obj as NamedElement).name + (if (result.equals("")) result else "." + result) 
			obj = obj.eContainer
		}
		return result;
	}
}