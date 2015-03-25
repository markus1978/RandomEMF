package de.hub.rcore.example.metrics;

import de.hub.rcore.example.el.ELCall;
import de.hub.rcore.example.el.ELClass;
import de.hub.rcore.example.el.ELMethod;
import de.hub.rcore.example.metrics.Metrics;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class ELMetrics extends Metrics {
  public boolean isClass(final EObject obj) {
    return (obj instanceof ELClass);
  }
  
  public int methods(final EObject clazz) {
    EList<ELMethod> _methods = ((ELClass) clazz).getMethods();
    return _methods.size();
  }
  
  public boolean isMethod(final EObject obj) {
    return (obj instanceof ELMethod);
  }
  
  public boolean isMethodCall(final EObject obj) {
    return (obj instanceof ELCall);
  }
}
