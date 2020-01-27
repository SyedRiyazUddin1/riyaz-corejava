//Simple program using lambda expression

package com.nisum.corejava.java8.lambdaexpressions.examples;

interface FunctInterface { // functional interface with 1 abstract method
	public void show();
}

public class LamdaExpresionDemo {
	public static void main(String[] args) {

		// creating an object reference of FunctInterface interface
		FunctInterface obj;

		// Java 7 implementation below
		/* 
		 * obj = new FunctInterface() { 
		 * public void show() { 				//defining the show method here
		 * System.out.println("Hello"); } };
		 */

		// Lambda expression below

		/*
		 * obj = () -> { System.out.println("Hello"); };
		 */

		// removed the curly brackets from the above lambda expression because there is
		// only one line.
		obj = () -> System.out.println("Hello");

		obj.show();

	}
}
