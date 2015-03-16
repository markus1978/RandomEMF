package de.hub.randomemf.runtime;

import org.apache.commons.lang.RandomStringUtils;

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
	
	public static int Uniform(double min , double max) {
		return new cern.jet.random.Uniform(min, max, rand).nextInt();
	}
	
	public static boolean UniformBool(double percent) {
		return new cern.jet.random.Uniform(0,1,rand).nextDouble() <= percent;
	}
	
	public static int Normal(double m, double v) {
		return new cern.jet.random.Normal(m, v, rand).nextInt();
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
	
	public static String ClassName(int syls) {
		return names.className(syls < 1 ? 1 : syls);
	}
	
	public static String VarName(int syls) {
		return names.variableName(syls < 1 ? 1 : syls);
	}
	
	public static String MethodName(int syls) {
		return names.methodName(syls < 1 ? 1 : syls);
	}
}
