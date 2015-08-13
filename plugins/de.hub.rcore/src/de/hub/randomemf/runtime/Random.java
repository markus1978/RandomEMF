package de.hub.randomemf.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.eclipse.emf.ecore.EObject;

import cern.jet.random.NegativeBinomial;
import cern.jet.random.engine.DRand;
import cern.jet.random.engine.RandomEngine;

public class Random {

	private static RandomEngine rand = new DRand(0);
	private static RandomNames names = new RandomNames(rand);
	private static LoremIpsum lorem = new LoremIpsum();
	
	public static RandomEngine Rand() {
		return rand;
	}
	
	public static int RandomInt(int maxExclusive) {
		return (int)Math.floor(rand.nextFloat()*maxExclusive);
	}
	
	public static int NegBinomial(int n, double p) {
		return new NegativeBinomial(n, p, rand).nextInt();
	}
	
	public static int Content() {
		return new NegativeBinomial(4, 0.5, rand).nextInt();
	}
	
	public static int Content(double m) {
		int r = (int)Math.rint(m*0.5/(1-0.5));
		double p = r / (m + r);
		return new NegativeBinomial(r, p, rand).nextInt();
	}
	
	public static int Uniform(double min , double max) {
		return new cern.jet.random.Uniform(min, max, rand).nextInt();
	}
	
	public static boolean UniformBool(double percent) {
		return new cern.jet.random.Uniform(0,1,rand).nextDouble() <= percent;
	}
	
	public static int Normal(double m, double v) {
		return new cern.jet.random.Normal(m, v, rand).nextInt();
	}
	
	public static int Poisson(double m) {
		return new cern.jet.random.Poisson(m, rand).nextInt();
	}
	
	public static String RandomID(int length) {
		return RandomStringUtils.randomAlphabetic(length <= 0 ? 1 : length);
	}
	
	public static String RandomString(int length) {
		return "\"" + RandomStringUtils.randomAscii(length <= 0 ? 1 : length).replace('"', ' ') + "\"";
	}
	
	public static String LoremIpsum(int length) {
		return "\"" + lorem.getWords(length, (int)Math.floor(rand.nextFloat()*50)) + "\"";
	}
	
	public static <T> T Uniform(Iterable<T> list) {
		int size = 0;
		for (T t: list) {
			size++;
		}
		
		if (size == 0) {
			return null;
		} else {
			int index = Uniform(0, size - 1);
			int i = 0;
			for (T t: list) {
				if (i == index) {
					return t;
				}
				i++;
			} 
		}
		
		return null;
	}
	
	public static String LatinCamel(int syls) {
		return names.className(syls < 1 ? 1 : syls);
	}
	
	public static String ClassName(int syls) {
		return names.className(syls < 1 ? 1 : syls);
	}
	
	public static String VarName(int syls) {
		return names.variableName(syls < 1 ? 1 : syls);
	}
	
	public static String MethodName(int syls) {
		return names.methodName(syls < 1 ? 1 : syls);
	}
	
	public static <T extends EObject> T RandomWalk(int distance, EObject source, Class<T> clazz) {
		return RandomWalk(distance, source, new HashSet<EObject>(), clazz);
	}
	
	@SuppressWarnings("unchecked")
	private static <T extends EObject> T RandomWalk(int distance, EObject source, Collection<EObject> visited, Class<T> clazz) {
		visited.add(source);
		
		if (distance == 0) {
			if (clazz.isAssignableFrom(source.getClass())) {
				return (T)source;
			} else {
				return null;
			}
		} else {
			List<EObject> nextPossibilities = new ArrayList<EObject>();		
			EObject eContainer = source.eContainer();
			if (eContainer != null && !visited.contains(eContainer)) {
				nextPossibilities.add(eContainer);
			}
			for(EObject content: source.eContents()) {
				if (content != null && !visited.contains(content)) {
					nextPossibilities.add(content);
				}
			}
			
			int numberOfPossibilities = nextPossibilities.size();
			int index = new cern.jet.random.Uniform(0, numberOfPossibilities-1, rand).nextInt();
			EObject result = null;
			for (int i = 0; i < numberOfPossibilities; i++) {				
				EObject next = nextPossibilities.get(index);
				result = RandomWalk(distance-1, next, visited, clazz);
				if (result != null) {
					return (T)result;
				}
				index = (index + 1)%numberOfPossibilities;
			}
			
			return null;
		}
	}
}
