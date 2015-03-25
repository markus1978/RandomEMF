package de.hub.rcore.example.metrics;

import de.hub.rcore.example.metrics.Metrics;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.AbstractMethodInvocation;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.TypeDeclaration;

@SuppressWarnings("all")
public class JavaMetrics extends Metrics {
  public boolean isClass(final EObject obj) {
    return (obj instanceof TypeDeclaration);
  }
  
  public int methods(final EObject clazz) {
    EList<BodyDeclaration> _bodyDeclarations = ((TypeDeclaration) clazz).getBodyDeclarations();
    return _bodyDeclarations.size();
  }
  
  public boolean isMethod(final EObject obj) {
    return (obj instanceof BodyDeclaration);
  }
  
  public boolean isMethodCall(final EObject obj) {
    return (obj instanceof AbstractMethodInvocation);
  }
}
