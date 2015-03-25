package de.hub.rcore.example

import de.hub.randomemf.runtime.Ocl
import de.hub.randomemf.runtime.Random
import de.hub.rcore.example.el.ELCall
import de.hub.rcore.example.el.ELClass
import de.hub.rcore.example.el.ELMethod
import de.hub.rcore.example.el.ELModel
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject

class RandomELUtil {

	static def uniformMethods(ELModel model, ELCall ctx) {
		return Ocl.collectAll(model.packages)[Ocl.collectAll(it.classes)[it.methods]]
	}

	static def dependencyMethods(ELModel model, ELCall ctx) {
		var obj = ctx as EObject
		while (!(obj instanceof ELClass)) {
			obj = obj.eContainer
		}
		val callerClass = obj as ELClass
		if (Random.UniformBool(0.4)) {
			return callerClass.methods
		} else {
			return Ocl.collectAll(model.packages)[
				Ocl.collectAll(it.classes) [
					val result = new ArrayList<ELMethod>()
					if (Random.UniformBool(0.1)) {
						result.addAll(it.methods)
					}
					if (depend(it, callerClass)) {
						result.addAll(it.methods)
						result.addAll(it.methods)
						result.addAll(it.methods)
						result.addAll(it.methods)
						result.addAll(it.methods)
						result.addAll(it.methods)
						result.addAll(it.methods)
						result.addAll(it.methods)
						result.addAll(it.methods)
						result.addAll(it.methods)
						result.addAll(it.methods)
					}
					result
				]]
		}
	}

	static def uniformHashCode(Object obj) {
		return ((obj.hashCode * 1103515245 + 12345) % (2147483648l)) as int
	}

	static def depend(ELClass one, ELClass two) {
		val diff = Math.abs(one.uniformHashCode - two.uniformHashCode) as Integer
		return diff < Integer.MAX_VALUE / 6 && diff > 0;
	}
}
