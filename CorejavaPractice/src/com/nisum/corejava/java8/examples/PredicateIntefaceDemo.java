// Java program to illustrate Simple Predicate 

package com.nisum.corejava.java8.examples;

import java.util.function.Predicate;

public class PredicateIntefaceDemo {

	public static void main(String[] args) {
		// Creating predicate
		Predicate<Integer> lesserthan = i -> (i < 18); // lambda expression

		// Calling Predicate method
		System.out.println(lesserthan.test(11));
	}
}
