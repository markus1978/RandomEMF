package de.hub.randomemf.scoping;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.common.types.xtext.AbstractTypeScopeProvider;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;

import com.google.common.base.Predicate;
import com.google.inject.Inject;
 
@SuppressWarnings( "restriction" )
public class TypesAndImportUriAwareGlobalScopeProvider extends ImportUriGlobalScopeProvider {
 
	@Inject
	private AbstractTypeScopeProvider typeScopeProvider;

	@Override
	public IScope getScope(Resource resource, EReference reference, Predicate<IEObjectDescription> filter) {
		EClass referenceType = getEReferenceType(resource, reference);
		if (EcoreUtil2.isAssignableFrom(TypesPackage.Literals.JVM_TYPE, referenceType)) {
			return typeScopeProvider.getScope(resource, reference, filter);
		}
		if (EcoreUtil2.isAssignableFrom(TypesPackage.Literals.JVM_CONSTRUCTOR, referenceType)) {
			return typeScopeProvider.getScope(resource, reference, filter);
		}
		return super.getScope(resource, reference, filter);
	}

	protected EClass getEReferenceType(Resource resource, EReference reference) {
		return reference.getEReferenceType();
	}
}