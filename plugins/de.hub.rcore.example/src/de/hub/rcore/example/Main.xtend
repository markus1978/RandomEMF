package de.hub.rcore.example

import java.io.File
import java.io.PrintWriter

class Main {
	
	def static main(String[] args) {
	  	val generator = new ELGenerator();
		val elMetrics = generator.generate(new RandomEL(), null, new File("model/hierarchy/el.json"), new File("model/dependencies/el.json"), new File("model/el.code"))
		val elUniformCallsMetrics = generator.generate(new RandomUniformCallsEL(), null, null, new File("model/dependencies/eluniformcalls.json"), null)
		val syntheticMetrics = generator.generate(new SyntheticEL(), null, new File("model/hierarchy/synthetic.json"), null, null);
		val javaMetrics = new Java2Json().generate()
		
		val out = new PrintWriter(new File("model/metrics/metrics.csv"))
		out.print('''
			name,elements,classes,methods per class, method calls,elements per method, depth
			el, «elMetrics»
			calls, «elUniformCallsMetrics»
			synthetic, «syntheticMetrics»
			java, «javaMetrics»
		''')
		out.close
	}
}