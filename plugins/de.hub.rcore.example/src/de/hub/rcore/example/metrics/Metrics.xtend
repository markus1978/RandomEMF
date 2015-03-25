package de.hub.rcore.example.metrics

import org.eclipse.emf.ecore.EObject
import java.util.ArrayList

abstract class Metrics {
	var leafs = 0;
	var depthSum = 0;
	
	def metrics(EObject obj) {
		var elements = 0
		var classes = 0
		var methods = 0
		var methodCalls = 0
		var elementsInMethods = 0
		
		val iterator = obj.eAllContents()
		while (iterator.hasNext) {
			val current = iterator.next
			
			elements++
			if (isClass(current)) {
				classes++
				methods += current.methods
			}
			
			if (isMethod(current)) {
				iterator.prune
				val methodIterator = current.eAllContents
				while (methodIterator.hasNext) {
					val inMethodCurrent = methodIterator.next
					elementsInMethods++
					elements++
					if (inMethodCurrent.isMethodCall) {
						methodCalls++
					}
				}
			}
		}
		
		leafs = 0;
		depthSum = 0
		depth(obj, 0)
		
		val avgDepth = depthSum/(leafs as double)
		val avgMethodsPerClass = methods/(classes as double)
		val avgElementsPerMethod = elementsInMethods/(methods as double)
		
		return '''«elements», «classes», «avgMethodsPerClass», «methodCalls», «avgElementsPerMethod», «avgDepth»'''
	}
	
	def void depth(EObject o, int depth) {
		  if (o.eContents.empty) {
        leafs++;
        depthSum += depth
      } else {
        for (c:o.eContents) {
          depth(c, depth+1)
        }
      }
	}
	
	def abstract boolean isClass(EObject obj)
	def abstract int methods(EObject clazz)
	def abstract boolean isMethod(EObject obj)
	def abstract boolean isMethodCall(EObject obj)
	
}