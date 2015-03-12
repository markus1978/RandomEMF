package de.hub.rcore.example

import de.hub.randomemf.runtime.Ocl

class GenerateRandomEL {
	def static main(String[] args) {
		val model = new RandomEL().generate();
		for (generatedClass: Ocl.collectAll(model.getPackages().filter[!it.name.equals("predefined")])[it.classes]) {
			System.out.println(new ELPrettyPrinter().gen(generatedClass).toString().replace("\t", "  "));
			System.out.println("-----------------------------------------------------");
		}
	}
}