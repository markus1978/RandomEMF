package de.hub.randomemf.runtime

import cern.jet.random.engine.RandomEngine

class RandomNames {
	
	val NameGenerator names
	
	val nameDescription = '''		
		-a
		-al
		-au +c
		-an
		-ba
		-be
		-bi
		-br +v
		-da
		-di
		-do
		-du
		-e
		-eu +c
		-fa
		bi
		be
		bo
		bu
		nul +v
		gu
		da
		au +c -c
		fri
		gus
		+tus
		+lus
		+lius
		+nus
		+es
		+ius -c
		+cus
		+tor
		+cio
		+tin
	'''.toString
	
	new(RandomEngine rand) {
		names = new NameGenerator(nameDescription, rand)
	}
	
	def className(int syls) {
		names.compose(syls).toFirstUpper
	}
	
	def variableName(int syls) {
		names.compose(syls).toFirstLower
	}
	
	def methodName(int syls) {
		names.compose(syls).toFirstLower
	}

}