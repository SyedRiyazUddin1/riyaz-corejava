package com.corejava.java8;

import com.corejava.util.MyLogger;

interface FunctInterface { // functional interface with 1 abstract method
	public void show();
}

public class LambdaExprDemo {
	public static void main(String[] args) {

		// creating an object reference of FunctInterface interface
		FunctInterface obj;

		// Java 7 implementation below
		/*
		 * obj = new FunctInterface()
		 * 
		 * //defining the show method
		 * 
		 * { public void show() { 
		 * System.out.println("Hello"); } };
		 */

		// Lambda expression below

		/*
		 * obj = () -> { System.out.println("Hello"); };
		 */

		// removed the curly brackets from the above lambda expression because there is
		// only one line.
		obj = () -> MyLogger.consoleLogger.info("Hello");

		obj.show();

	}
}
