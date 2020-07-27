 package com.corejava.java8.Function;

import java.util.function.Function;

import com.corejava.util.MyLogger;

public class FunctionDemo1 {

	/**
	 * Before Java 8:
	 * 
	 * public static int squareIt(int num) { 
	 * return num * num; }
	 */

	public static void main(String[] args) {

		// MyLogger.consoleLogger.info("Square of 4 is :" + squareIt(4));

		// In java 8, using Function interface
		
		Function<Integer, Integer> func1 = num -> num * num;
		Function<String, Integer> func2 = str -> str.length();
		Function<String, String> func3 = str -> str.toUpperCase();
		
		
		MyLogger.consoleLogger.info("Square of 4 is : " + func1.apply(4));
		MyLogger.consoleLogger.info("Length of given string is : " + func2.apply("Riyaz"));
		MyLogger.consoleLogger.info("UpperCasing the given string : " + func3.apply("riyaz"));
		
	}

}
