package com.nisum.corejava.java8.examples;

import java.util.function.Function;

public class FunctionInterfaceDemo {

	public static void main(String args[]) {

		// Function which takes in a number and returns half of it
		Function<Integer, Double> half = a -> a / 2.0; // lambda expression

		// apply the function to get the result
		System.out.println("Half of the give number is: " +half.apply(10));

	}
}
