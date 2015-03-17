package de.hub.rcore.example

import de.hub.rcore.example.el.ELExpression
import de.hub.rcore.example.el.ELStatement
import java.io.File
import java.io.PrintWriter
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.gmt.modisco.java.Model
import org.eclipse.gmt.modisco.java.Package
import org.eclipse.gmt.modisco.java.emf.JavaPackage
import org.eclipse.gmt.modisco.java.Expression
import org.eclipse.gmt.modisco.java.Statement
import org.eclipse.gmt.modisco.java.TypeDeclaration
import org.eclipse.gmt.modisco.java.BodyDeclaration

class Java2Json {
	def static main(String[] args) {
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
		
		val out = new PrintWriter(new File("model/java.json"))
		out.print(new Java2Json().gen(pkg))
		out.close
	}
	
	def CharSequence gen(EObject eObject) '''
	{
		"name" : "«eObject.className»"«IF !eObject.eContents.empty»,«ENDIF»
		«IF !eObject.eContents.empty»
			"children": [
				«FOR eChild:eObject.eContents SEPARATOR ","»
					«eChild.gen»
				«ENDFOR»
			]
		«ENDIF»
	}
	'''
	
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
}