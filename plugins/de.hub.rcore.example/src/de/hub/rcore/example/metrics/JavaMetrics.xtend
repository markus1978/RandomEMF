package de.hub.rcore.example.metrics

import org.eclipse.emf.ecore.EObject
import org.eclipse.gmt.modisco.java.BodyDeclaration
import org.eclipse.gmt.modisco.java.TypeDeclaration
import org.eclipse.gmt.modisco.java.AbstractMethodInvocation

class JavaMetrics extends Metrics {
  
  override isClass(EObject obj) {
    return obj instanceof TypeDeclaration
  }
  
  override methods(EObject clazz) {
    return (clazz as TypeDeclaration).bodyDeclarations.size
  }
  
  override isMethod(EObject obj) {
    return (obj instanceof BodyDeclaration)
  }
  
  override isMethodCall(EObject obj) {
    return (obj instanceof AbstractMethodInvocation)
  }
 
}