package de.hub.rcore.example;
import de.hub.rcore.example.el.ELClass;
import de.hub.rcore.example.el.ELPackage;


public class GenerateRandomEL {
	public static void main(String[] args) {
		ELPackage generatedPackage = new RandomEL().generate();
		for (ELClass generatedClass: generatedPackage.getClasses()) {
			System.out.println(new ELPrettyPrinter().gen(generatedClass).toString().replace("\t", "  "));
			System.out.println("-----------------------------------------------------");
		}
	}
}
