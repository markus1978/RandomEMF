package de.hub.randomemf.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class EContainerScope extends AbstractScope {
	private final EObject eObject;
	private final EReference eReference;
	private final EAttribute nameAttribute;

	public EContainerScope(EObject eObject, EReference eReference, EAttribute nameAttribute) {
		super(IScope.NULLSCOPE, false);
		this.eObject = eObject;
		this.eReference = eReference;
		this.nameAttribute = nameAttribute;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		return Iterables.transform((EList<? extends EObject>)eObject.eGet(eReference), new Function<EObject, IEObjectDescription>() {
			public IEObjectDescription apply(final EObject eObject) {
				return new IEObjectDescription() {
					
					@Override
					public String[] getUserDataKeys() {
						return new String[] {};
					}
					
					@Override
					public String getUserData(String key) {
						return null;
					}
					
					@Override
					public QualifiedName getQualifiedName() {	
						List<String> names = new ArrayList<String>();
						EObject obj = eObject;
						while (obj != null) {
							names.add((String)obj.eGet(nameAttribute));
							obj = obj.eContainer();
						}
						return QualifiedName.create(Lists.reverse(names));
					}
					
					@Override
					public QualifiedName getName() {
						return QualifiedName.create((String)eObject.eGet(nameAttribute));
					}
					
					@Override
					public URI getEObjectURI() {
						return EcoreUtil.getURI(eObject);
					}
					
					@Override
					public EObject getEObjectOrProxy() {
						return eObject;
					}
					
					@Override
					public EClass getEClass() {
						return eObject.eClass();
					}
				};
			}
		});
	}
}