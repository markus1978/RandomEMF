package de.hub.rcore.example

import de.hub.randomemf.runtime.Ocl
import java.io.PrintWriter
import java.io.File
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EcorePackage

class GenerateRandomEL {
	def static main(String[] args) {
		val model = new RandomEL().generate();
		for (generatedClass: Ocl.collectAll(model.getPackages().filter[!it.name.equals("predefined")])[it.classes]) {
			System.out.println(new ELPrettyPrinter().gen(generatedClass).toString().replace("\t", "  "));
			System.out.println("-----------------------------------------------------");
		}
		
		val out = new PrintWriter(new File("model/el.json"));
		out.println(new EMF2Json().gen(model.getPackages().filter[!it.name.equals("predefined")].get(0)).toString().replace("\t", "  "))
		out.close()
	}
}