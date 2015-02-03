package de.hub.randomemf.runtime;

import org.eclipse.emf.ecore.EObject;

public interface IGenerator {
	public EObject resolve(EObject proxy);
}
