/*
* generated by Xtext
*/
package de.hub.randomemf;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class RandomEMFStandaloneSetup extends RandomEMFStandaloneSetupGenerated{

	public static void doSetup() {
		new RandomEMFStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

