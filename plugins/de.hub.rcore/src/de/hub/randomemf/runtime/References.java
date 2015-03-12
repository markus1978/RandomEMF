package de.hub.randomemf.runtime;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

public class References {
	public static <T extends EObject> T createProxy(T value, String description) {
		((InternalEObject)value).eSetProxyURI(URI.createURI(description));
		return value;
	}
	
	@SuppressWarnings("unchecked")
	public static void resolveReferences(IGenerator generator, EObject model) {
		TreeIterator<EObject> eAllContents = model.eAllContents();
		while (eAllContents.hasNext()) {
			EObject eObject = (EObject) eAllContents.next();
			EClass eClass = eObject.eClass();
			for (EReference feature: eClass.getEAllReferences()) {
				if (!feature.isContainment() && !feature.isDerived() && feature.isChangeable() && !feature.isVolatile()) {
					if (feature.isMany()) {
						@SuppressWarnings({ "rawtypes" })
						EList values = (EList)eObject.eGet(feature);
						for (int i = 0; i < values.size(); i++) {
							EObject value = (EObject)values.get(i);
							if (value != null && value.eIsProxy()) {
								values.set(i, generator.resolve(value));
							}
						}
					} else {
						EObject value = (EObject)eObject.eGet(feature);
						if (value != null && value.eIsProxy()) {
							eObject.eSet(feature, generator.resolve(value));
						}
					}
				}
			}
		}
	}
}
