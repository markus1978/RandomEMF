package de.hub.randomemf.runtime

import java.util.ArrayList

class Ocl {
	static def <T,R> collect(Iterable<T> col, (T)=>R predicate) {
		return col.fold(new ArrayList<R>(), [r,e|r.add(predicate.apply(e));r]);
	}
	
	static def <T,R> collectAll(Iterable<T> col, (T)=>Iterable<R> predicate) {
		return col.fold(new ArrayList<R>(), [r,e|r.addAll(predicate.apply(e));r]);
	}
}