package de.hub.rcore.example

import de.hub.randomemf.runtime.Ocl
import de.hub.rcore.example.el.ExampleLanguagePackage
import de.hub.rcore.example.metrics.ELMetrics
import java.io.File
import java.io.PrintWriter
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import de.hub.randomemf.runtime.IGenerator
import de.hub.rcore.example.el.ELModel

class ELGenerator {

	def generate(IGenerator generator, URI uri, File hierarchyJson, File methodCallsJson, File code) {
		val model = generator.generate() as ELModel;

		if (code != null) {
			val out = new PrintWriter(code)
			for (generatedClass : Ocl.collectAll(model.getPackages().filter[!it.name.equals("predefined")])[it.classes]) {
				out.println(new ELPrettyPrinter().gen(generatedClass).toString().replace("\t", "  "));
				out.println("-----------------------------------------------------");
			}
			out.close()
		}

		val el2json = new EMF2Json();
		if (hierarchyJson != null) {
			val out = new PrintWriter(hierarchyJson)
			out.println(
				el2json.genHierarchy(model.getPackages().filter[!it.name.equals("predefined")].get(0)).toString().
					replace("\t", "  "))
			out.close()
		}

		if (methodCallsJson != null) {
			val out = new PrintWriter(methodCallsJson)
			val list = model.getPackages().filter[!it.name.equals("predefined")]
			el2json.genMethodCalls(list, out)
			out.close
		}

		if (uri != null) {
			EPackage.Registry.INSTANCE.put(ExampleLanguagePackage.eINSTANCE.nsURI, ExampleLanguagePackage.eINSTANCE);
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl);

			val rs = new ResourceSetImpl()
			val r = rs.createResource(uri);
			r.contents.add(model);
			r.save(null);
		}

		return new ELMetrics().metrics(model.getPackages().filter[!it.name.equals("predefined")].get(0))
	}
}
