package de.hub.randomemf.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsBatchScopeProvider;

@SuppressWarnings("restriction") // TODO
public class RcoreBatchScopeProvider extends XbaseWithAnnotationsBatchScopeProvider {
	@Override
	public IScope getScope(EObject context, EReference reference) {
		IScope scope = RcoreScopeProvider.staticGetScope(context, reference);
		if (scope == null) {
			return super.getScope(context, reference);
		} else {
			return scope;
		}
	}
}
