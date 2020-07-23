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
		
		Function<Integer, Integer> func = num -> num * num;
		
		MyLogger.consoleLogger.info("Square of 4 is : " + func.apply(4));
	}

}
