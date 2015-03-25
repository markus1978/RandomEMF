package de.hub.rcore.example

import org.eclipse.emf.ecore.EObject
import de.hub.rcore.example.el.ELStatement
import de.hub.rcore.example.el.ELExpression
import de.hub.rcore.example.el.ELBlock
import de.hub.rcore.example.el.ELClass
import de.hub.rcore.example.el.ELMethod
import de.hub.rcore.example.el.ELField
import de.hub.rcore.example.el.ELCall
import de.hub.rcore.example.el.ELNamedElement
import java.io.PrintWriter
import java.util.List
import de.hub.rcore.example.el.ELOpCall

class EMF2Json {
	def genHierarchy(EObject eObject) '''
	{
		"name" : "«eObject.className»"«IF !eObject.eContents.empty»,«ENDIF»
		«IF !eObject.eContents.empty»
			"children": [
				«FOR eChild:eObject.eContents SEPARATOR ","»
					«eChild.genHierarchy»
				«ENDFOR»
			]
		«ENDIF»
	}
	'''
	
	def genMethodCalls(Iterable<? extends EObject> eObjects, PrintWriter out) {
		out.print("[")
		var first = true;
		for (eObject: eObjects) {
			val iterator = eObject.eAllContents
			while (iterator.hasNext) {
				val content = iterator.next
				if (content instanceof ELMethod) {
					val declaration = content as ELMethod
					val name = declaration.methodName
					if (!name.endsWith("new")) {
						if (first) {
							first = false
						} else {
							out.print(",")
						}
						out.print('''{ "name":"«declaration.methodName»", "size":1, "imports":[''')
						
						if (declaration.block != null) {
							val bodyIterator =  declaration.block.eAllContents
							var bodyFirst = true;
							while (bodyIterator.hasNext) {
								val bodyContent = bodyIterator.next
								if (bodyContent instanceof ELCall && !(bodyContent instanceof ELOpCall) ) {
									val invocation = bodyContent as ELCall
									val called = invocation.callee
									val calledName = called.methodName
									if (!calledName.startsWith("predefined") && !calledName.endsWith("new") && !name.equals(calledName) && !calledName.equals("")) {
										if (bodyFirst) {					
											bodyFirst = false
										} else {
											out.print(",")
										}
										out.print('''"«calledName»"''')
									}
								}
							}
						}
						out.print(''']}''')
					}					
				}
			}
		}	
		out.print("]")
	}
	
	def className(EObject eObject) {
		if (eObject instanceof ELClass) {
			return "1"
		} else if (eObject instanceof ELMethod || eObject instanceof ELField) {
			return "2"
		} else if (eObject instanceof ELExpression) {
			return "4"
		} else if (eObject instanceof ELStatement || eObject instanceof ELBlock) {
			return "3"
		} else {
			return "5"
		}
	}
	
	def methodName(ELMethod declaration) {
		var result = ""
		var obj = declaration as EObject
		while (obj != null && obj instanceof ELNamedElement && (obj as ELNamedElement).name != null) {
			result = (obj as ELNamedElement).name + (if (result.equals("")) result else "." + result) 
			obj = obj.eContainer
		}
		return result;
	}
}