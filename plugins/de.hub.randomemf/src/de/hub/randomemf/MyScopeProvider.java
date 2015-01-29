package de.hub.randomemf;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.eclipse.xtext.xbase.annotations.scoping.XbaseWithAnnotationsScopeProvider;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;

import de.hub.randomemf.randomEMF.ClassRule;
import de.hub.randomemf.randomEMF.Generator;
import de.hub.randomemf.randomEMF.RandomEMFPackage;

public class MyScopeProvider extends XbaseWithAnnotationsScopeProvider {

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
							return QualifiedName.create((String)eObject.eGet(nameAttribute));
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
	
	@Override
	public IScope getScope(EObject context, EReference reference) {
		if (reference == RandomEMFPackage.eINSTANCE.getClassRule_EClass()) {
			final EPackage ecorePackage = ((Generator)context.eContainer()).getEcorePackage();
			if (!ecorePackage.eIsProxy()) {
				return new EContainerScope(ecorePackage, EcorePackage.eINSTANCE.getEPackage_EClassifiers(), EcorePackage.eINSTANCE.getENamedElement_Name());
			}	
		} else if (reference == RandomEMFPackage.eINSTANCE.getFeatureRule_EFeature()) {
			final EClass ecoreClass = ((ClassRule)context.eContainer()).getEClass();
			if (!ecoreClass.eIsProxy()) {
				return new EContainerScope(ecoreClass, EcorePackage.eINSTANCE.getEClass_EAllStructuralFeatures(), EcorePackage.eINSTANCE.getENamedElement_Name());
			}
		}
		
		return super.getScope(context, reference);
	}

}
