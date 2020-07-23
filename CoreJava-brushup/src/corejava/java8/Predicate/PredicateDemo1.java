package com.corejava.java8.Predicate;

import java.util.function.Predicate;

import com.corejava.util.MyLogger;

public class PredicateDemo1 {

	public static void main(String[] args) {

		// checking even number in Java 8

		Predicate<Integer> predicate = num -> num % 2 == 0;

		MyLogger.consoleLogger.info(predicate.test(4)); // prints "true"

	}
}
