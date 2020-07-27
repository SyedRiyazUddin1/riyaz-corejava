package com.corejava.java8.Predicate;

//Using predicate, printing the numbers which are EVEN and >10.
// using and(), or(), negate() methods in predicate interface

import java.util.function.Predicate;

import com.corejava.util.MyLogger;

public class PredicateJoiningDemo {

	public static void main(String[] args) {

		int[] x = { 0, 5, 6, 7, 9, 10, 12, 15, 18 };

		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 10;

		// and(), or(), negate() methods in predicate interface

		MyLogger.consoleLogger.info("The numbers which are even and greater than 10 are:");

		for (int x1 : x) {
			if (p1.and(p2).test(x1)) { //and() method if both the conditions must be satisfied
	     // if (p1.or(p2).test(x1)) { //or() method if we need either even OR >10 numbers
		 // if (p1.negate().test(x1)) { // opposite of mentioned predicate, will get only odd numbers

				MyLogger.consoleLogger.info(x1);
			}
		}

	}
}
