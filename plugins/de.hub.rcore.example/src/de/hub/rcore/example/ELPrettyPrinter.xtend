package de.hub.rcore.example

import de.hub.rcore.example.el.ELPackage
import de.hub.rcore.example.el.ELClass
import de.hub.rcore.example.el.ELNamedElement
import de.hub.rcore.example.el.ELTypedElement
import de.hub.rcore.example.el.ELVariable
import de.hub.rcore.example.el.ELBlock
import de.hub.rcore.example.el.ELModel
import de.hub.rcore.example.el.validation.ELBlockStarementKindValidator
import de.hub.rcore.example.el.ELBlockStatement
import de.hub.rcore.example.el.ELLiteral
import de.hub.rcore.example.el.ELOpCall
import de.hub.rcore.example.el.ELCall
import de.hub.rcore.example.el.ELAccess
import de.hub.rcore.example.el.ELOpKind
import org.eclipse.emf.ecore.EObject
import de.hub.rcore.example.el.ELAssignment

class ELPrettyPrinter {
	def gen(ELClass elClass) '''
		«IF elClass.eContainer instanceof ELPackage»
			package «(elClass.eContainer as ELPackage).name»;
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
					«IF (method.block != null)»«method.block.gen»«ENDIF»
				}
			«ENDFOR»
		}
	'''
	
	def gen(ELBlock block) '''
		«FOR statement:block.statements»
			«statement.genStatement»
		«ENDFOR»
	'''
	
	def dispatch CharSequence genStatement(ELBlockStatement statement) {
		var syntax = statement.kind.syntax;
		for (i:1..statement.kind.blocks) {
			syntax = syntax.replace("{&"+i+"}", '''
			{
				«FOR s:statement.block.get(i-1).statements»
					«s.genStatement»
				«ENDFOR»
			}''')
		}
		for (i:1..statement.kind.expressions) {
			syntax = syntax.replace("#"+i, statement.expressions.get(i-1).genStatement)
		}
		return syntax
	}
	
	def dispatch CharSequence genStatement(ELLiteral statement) '''«statement.value»'''
	
	def dispatch CharSequence genStatement(ELOpCall statement) {
		if (statement.kind.kind == ELOpKind.PREFIX) {
			return '''«statement.kind.syntax»«statement.arguments.get(0).genStatement»'''
		} else if (statement.kind.kind == ELOpKind.SUFFIX) {
			return '''«statement.arguments.get(0).genStatement»«statement.kind.syntax»'''
		} else if (statement.kind.kind == ELOpKind.INFIX) {
			return '''«statement.arguments.get(0).genStatement»«statement.kind.syntax»«statement.arguments.get(1).genStatement»'''
		} else {
			if (statement.arguments.size != statement.kind.operands) {
				System.out.println("HUHU: " + statement.kind.syntax + ", " + statement.eClass.name + ", " + statement.arguments.size + ", " + System.identityHashCode(statement));
			}
			var syntax = statement.kind.syntax
			for (var i = 1; i <= statement.kind.operands; i++) {				
				syntax = syntax.replace("#"+i, statement.arguments.get(i-1).genStatement.toString())
			}
			return syntax;
		}
	}	
	
	def dispatch CharSequence genStatement(ELCall statement) '''«IF statement.thisArgument != null»«statement.thisArgument.genStatement».«ENDIF»«IF statement.callee != null»«statement.callee.name»«ENDIF»(«FOR a:statement.arguments SEPARATOR ", "»«a.genStatement»«ENDFOR»)«IF statement.eContainer instanceof ELBlock»;«ENDIF»'''
	
	def dispatch CharSequence genStatement(ELAccess statement) '''«statement.variable.name»'''
	
	def dispatch CharSequence genStatement(ELAssignment assignment) '''«assignment.assignee.name» = «assignment.expr.genStatement»;'''
	
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
		if (el == null || el instanceof ELModel) {
			return "void"
		} else if (el.eContainer == context) {
			return el.name;
		} else {
			val prefix = (el.eContainer as ELNamedElement).ref(context)
			return (if (prefix.equals("void") || prefix.equals("predefined")) "" else prefix + ".") + el.name;
		}		
	}
}