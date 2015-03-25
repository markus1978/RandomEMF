package de.hub.rcore.example.metrics;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public abstract class Metrics {
  private int leafs = 0;
  
  private int depthSum = 0;
  
  public String metrics(final EObject obj) {
    int elements = 0;
    int classes = 0;
    int methods = 0;
    int methodCalls = 0;
    int elementsInMethods = 0;
    final TreeIterator<EObject> iterator = obj.eAllContents();
    while (iterator.hasNext()) {
      {
        final EObject current = iterator.next();
        elements++;
        boolean _isClass = this.isClass(current);
        if (_isClass) {
          classes++;
          int _methods = methods;
          int _methods_1 = this.methods(current);
          methods = (_methods + _methods_1);
        }
        boolean _isMethod = this.isMethod(current);
        if (_isMethod) {
          iterator.prune();
          final TreeIterator<EObject> methodIterator = current.eAllContents();
          while (methodIterator.hasNext()) {
            {
              final EObject inMethodCurrent = methodIterator.next();
              elementsInMethods++;
              elements++;
              boolean _isMethodCall = this.isMethodCall(inMethodCurrent);
              if (_isMethodCall) {
                methodCalls++;
              }
            }
          }
        }
      }
    }
    this.leafs = 0;
    this.depthSum = 0;
    this.depth(obj, 0);
    final double avgDepth = (this.depthSum / ((double) this.leafs));
    final double avgMethodsPerClass = (methods / ((double) classes));
    final double avgElementsPerMethod = (elementsInMethods / ((double) methods));
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(elements, "");
    _builder.append(", ");
    _builder.append(classes, "");
    _builder.append(", ");
    _builder.append(avgMethodsPerClass, "");
    _builder.append(", ");
    _builder.append(methodCalls, "");
    _builder.append(", ");
    _builder.append(avgElementsPerMethod, "");
    _builder.append(", ");
    _builder.append(avgDepth, "");
    return _builder.toString();
  }
  
  public void depth(final EObject o, final int depth) {
    EList<EObject> _eContents = o.eContents();
    boolean _isEmpty = _eContents.isEmpty();
    if (_isEmpty) {
      this.leafs++;
      int _depthSum = this.depthSum;
      this.depthSum = (_depthSum + depth);
    } else {
      EList<EObject> _eContents_1 = o.eContents();
      for (final EObject c : _eContents_1) {
        this.depth(c, (depth + 1));
      }
    }
  }
  
  public abstract boolean isClass(final EObject obj);
  
  public abstract int methods(final EObject clazz);
  
  public abstract boolean isMethod(final EObject obj);
  
  public abstract boolean isMethodCall(final EObject obj);
}
