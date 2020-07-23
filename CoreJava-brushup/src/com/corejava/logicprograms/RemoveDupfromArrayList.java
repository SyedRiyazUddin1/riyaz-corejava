package com.corejava.logicprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.corejava.util.MyLogger;

public class RemoveDupfromArrayList {

	public static void main(String args[]) {

		// creating ArrayList with duplicate elements.
		List<Integer> primes = new ArrayList<Integer>();

		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(7); // duplicate
		primes.add(7);
		primes.add(11);

		MyLogger.consoleLogger.info("list of prime numbers : " + primes);

		// Removing duplicates in java 8:

		List<Integer> newList = primes.stream().distinct().collect(Collectors.toList());
		MyLogger.consoleLogger.info("Using streams: " + newList);

		// Now let's remove duplicate element without affecting order
		// LinkedHashSet will guaranteed the order

		Set<Integer> primesWithoutDuplicates = new LinkedHashSet<Integer>(primes);

		// now let's clear the ArrayList so that we can copy all elements from
		// LinkedHashSet
		primes.clear();

		// copying elements but without any duplicates
		primes.addAll(primesWithoutDuplicates);

		MyLogger.consoleLogger.info("list of primes without duplicates : " + primes);

	}

}
