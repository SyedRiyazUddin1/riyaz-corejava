// Java program to illustrate Simple Predicate 

package com.javapractice.corejava.java8.functional_interfaces.examples;

import java.util.function.Predicate;

public class PredicateIntefaceDemo {

	public static void main(String[] args) {
		// Creating predicate
		Predicate<Integer> lesserthan = number -> (number < 18); // lambda expression

		// Calling Predicate method test()
		System.out.println(lesserthan.test(11));
	}
}
