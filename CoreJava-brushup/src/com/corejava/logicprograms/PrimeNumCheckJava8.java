package com.corejava.logicprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

import com.corejava.util.MyLogger;

public class PrimeNumCheckJava8 {

//	    public static boolean isPrime(long n) {
//	        for (long i = 2; i <= Math.sqrt(n); i++) {
//	            if (n % i == 0) {
//	                return false;
//	            }
//	        }
//	        return true;
//	    }

	// Using Streams, we can iterate like the above method
	public static boolean isPrime(long n) {
		return LongStream.rangeClosed(2, (long) Math.sqrt(n)).allMatch(i -> n % i != 0);
	}

	public static void main(String[] args) {
		MyLogger.consoleLogger.info("Is the number prime: " + isPrime(81));

//		//Iterating prime numbers from a list of integers
//		List<Integer> myList = Arrays.asList(2,3,7,9,13,16,17,19,21,25,27);
//		
//		List<Integer> newList = myList.stream()LongStream.rangeClosed(2, (int) Math.sqrt(myList)).filter()
	}
}
