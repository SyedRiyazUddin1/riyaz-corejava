package com.corejava.java8.methodreference;

import com.corejava.util.MyLogger;

class Sample {

	Sample(String s1) {
		MyLogger.consoleLogger.info("Sample class constructor execution..."+s1);
	}
}

interface Interf1 {

	public Sample get(String s1);
}

public class ConstructorReferenceDemo {

	public static void main(String[] args) {

		Interf1 interf = Sample::new;
		Sample s1 = interf.get("Riyaz");
		Sample s2 = interf.get("Syed");
	}

}
