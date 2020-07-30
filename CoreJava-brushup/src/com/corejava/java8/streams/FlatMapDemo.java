package com.corejava.java8.streams;

/** 
 * Combining all multiple lists into 1 using flatMap() method
 * */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.corejava.util.MyLogger;

public class FlatMapDemo {

	public static void main(String[] args) {
		// Creating a list of Prime Numbers
		List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11, 13);

		// Creating a list of Odd Numbers
		List<Integer> OddNumbers = Arrays.asList(1, 3, 5);

		// Creating a list of Even Numbers
		List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

		List<List<Integer>> listOfListofInts = Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

		MyLogger.consoleLogger.info("The Structure before flattening is : " + listOfListofInts);
		MyLogger.consoleLogger.info("Size of this list is: " + listOfListofInts.size());

		// Using flatMap for transformating and flattening.
		List<Integer> listofInts = listOfListofInts.stream().flatMap(list -> list.stream())
				.distinct()
				.sorted()
				.skip(2)
				.limit(5)
				.collect(Collectors.toList());

		MyLogger.consoleLogger.info("The Structure after flattening is : " + listofInts);
		MyLogger.consoleLogger.info("Size of this list is: " + listofInts.size());

	}
}
