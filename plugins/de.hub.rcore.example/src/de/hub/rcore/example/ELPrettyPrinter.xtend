package de.hub.rcore.example

import de.hub.rcore.example.el.ELPackage
import de.hub.rcore.example.el.ELClass
import de.hub.rcore.example.el.ELNamedElement
import de.hub.rcore.example.el.ELTypedElement
import de.hub.rcore.example.el.ELVariable
import de.hub.rcore.example.el.ELBlock

class ELPrettyPrinter {
	def gen(ELClass elClass) '''
		«IF elClass.eContainer instanceof ELPackage»
			package «(elClass.eContainer as ELPackage).name»
		«ENDIF»
		
		class «elClass.name» «elClass.superClassClause» {
			«FOR innerClass:elClass.innerClasses»
			
				«innerClass.gen»
			«ENDFOR»
			«FOR field:elClass.fields»
				
				«field.gen»;
			«ENDFOR»
			«FOR method:elClass.methods»
				
				«method.genType» «method.name»(«FOR par:method.parameters SEPARATOR ", "»«par.gen»«ENDFOR») {
					«method.block.gen»
				}
			«ENDFOR»
		}
	'''
	
	def gen(ELBlock block) ''''''
	
	def genType(ELTypedElement te) {
		val container = if (te.eContainer instanceof ELClass) te.eContainer.eContainer else te.eContainer.eContainer.eContainer;
		'''«te.type.ref(container)»«IF te.array»[]«ENDIF»'''
	}
	
	def gen(ELVariable variable) '''«variable.genType» «variable.name»'''
	
	def superClassClause(ELClass elClass) {
		if (elClass.superClases.isEmpty) {
			return ''''''
		} else {
			return ''': «FOR superClass:elClass.superClases SEPARATOR ", "»«superClass.ref(elClass.eContainer as ELNamedElement)»«ENDFOR»''' 
		}
	}
	
	def String ref(ELNamedElement el, Object context) {
		if (el == null) {
			return "void"
		} else if (el.eContainer == context) {
			return el.name;
		} else {
			return (el.eContainer as ELNamedElement).ref(context) + "." + el.name;
		}		
	}
}