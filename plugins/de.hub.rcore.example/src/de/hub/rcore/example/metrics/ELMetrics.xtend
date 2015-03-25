package de.hub.rcore.example.metrics

import de.hub.rcore.example.el.ELClass
import de.hub.rcore.example.el.ELMethod
import org.eclipse.emf.ecore.EObject
import de.hub.rcore.example.el.ELCall

class ELMetrics extends Metrics {
  
  override isClass(EObject obj) {
    return obj instanceof ELClass
  }
  
  override methods(EObject clazz) {
    return (clazz as ELClass).methods.size;
  }
  
  override isMethod(EObject obj) {
    return obj instanceof ELMethod
  }
  
  override isMethodCall(EObject obj) {
    return obj instanceof ELCall
  }
  
}