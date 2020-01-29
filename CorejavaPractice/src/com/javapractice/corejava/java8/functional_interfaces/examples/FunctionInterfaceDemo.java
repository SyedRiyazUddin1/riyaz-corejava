//Function interface Demo
package com.javapractice.corejava.java8.functional_interfaces.examples;

import java.util.function.Function;

public class FunctionInterfaceDemo {

	public static void main(String args[]) {

		// Function which takes in a number and returns half of it
		Function<Integer, Double> half = number -> number / 2.0; // lambda expression

		// calling the apply method here and passing the number
		System.out.println("Half of the give number is: " +half.apply(500));

	}
}
