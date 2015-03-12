package de.hub.randomemf.scoping;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.scoping.XImportSectionNamespaceScopeProvider;

import de.hub.randomemf.randomEMF.ClassRule;
import de.hub.randomemf.randomEMF.Generator;
import de.hub.randomemf.randomEMF.RandomEMFPackage;

@SuppressWarnings("restriction") // TODO
public class RcoreScopeProvider extends XImportSectionNamespaceScopeProvider {

	@Override
	public IScope getScope(EObject context, EReference reference) {
		IScope scope = staticGetScope(context, reference);
		if (scope == null) {
			return super.getScope(context, reference);
		} else {
			return scope;
		}
	}

	public static IScope staticGetScope(EObject context, EReference reference) {
		if (reference == RandomEMFPackage.eINSTANCE.getAbstractRule_EClass()) {
			EPackage ecorePackage = null;
			if (context instanceof Generator) {
				ecorePackage = ((Generator)context).getEcorePackage();
			} else if (context.eContainer() instanceof Generator) {
				ecorePackage = ((Generator)context.eContainer()).getEcorePackage();
			}
			
			if (ecorePackage != null && !ecorePackage.eIsProxy()) {
				return new EContainerScope(ecorePackage, EcorePackage.eINSTANCE.getEPackage_EClassifiers(), EcorePackage.eINSTANCE.getENamedElement_Name());
			}	
		} else if (reference == RandomEMFPackage.eINSTANCE.getInnerRule_EFeature()) {
			EClass ecoreClass = null;
			if (context instanceof ClassRule) {
				ecoreClass = ((ClassRule)context).getEClass();
			} else if (context.eContainer() instanceof ClassRule) {
				ecoreClass = ((ClassRule)context.eContainer()).getEClass();
			}
			if (ecoreClass != null) {
				if (!ecoreClass.eIsProxy()) {
					return new EContainerScope(ecoreClass, EcorePackage.eINSTANCE.getEClass_EAllStructuralFeatures(), EcorePackage.eINSTANCE.getENamedElement_Name());
				}
			}
		} else if (reference == RandomEMFPackage.eINSTANCE.getInnerRule_ConcreteValueType()) {
			EClass ecoreClass = null;
			if (context instanceof ClassRule) {
				ecoreClass = ((ClassRule)context).getEClass();
			} else if (context.eContainer() instanceof ClassRule) {
				ecoreClass = ((ClassRule)context.eContainer()).getEClass();
			}
			
			EPackage ecorePackage = null;
			if (context instanceof Generator) {
				ecorePackage = ((Generator)context).getEcorePackage();
			} else if (context.eContainer() instanceof Generator) {
				ecorePackage = ((Generator)context.eContainer()).getEcorePackage();
			}
			if (ecorePackage == null) {
				ecorePackage = ecoreClass.getEPackage();
			}
			if (ecorePackage != null && !ecorePackage.eIsProxy()) {
				return new EContainerScope(ecorePackage, EcorePackage.eINSTANCE.getEPackage_EClassifiers(), EcorePackage.eINSTANCE.getENamedElement_Name());
			}	
		}
		
		return null;
	}

}
