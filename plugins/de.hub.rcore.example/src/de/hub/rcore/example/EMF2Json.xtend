package de.hub.rcore.example

import org.eclipse.emf.ecore.EObject
import de.hub.rcore.example.el.ELStatement
import de.hub.rcore.example.el.ELExpression
import de.hub.rcore.example.el.ELBlock
import de.hub.rcore.example.el.ELClass
import de.hub.rcore.example.el.ELMethod
import de.hub.rcore.example.el.ELField

class EMF2Json {
	def gen(EObject eObject) '''
	{
		"name" : "«eObject.className»"«IF !eObject.eContents.empty»,«ENDIF»
		«IF !eObject.eContents.empty»
			"children": [
				«FOR eChild:eObject.eContents SEPARATOR ","»
					«eChild.gen»
				«ENDFOR»
			]
		«ENDIF»
	}
	'''
	
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
}