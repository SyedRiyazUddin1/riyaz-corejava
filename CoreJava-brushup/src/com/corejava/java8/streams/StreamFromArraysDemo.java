package com.corejava.java8.streams;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.corejava.util.MyLogger;

public class StreamFromArraysDemo {

	public static void main(String[] args) {

		int myArray[] = { 0, 1, 2, 3, 5, 9, 12, 13, 16, 19 };
		int sum = Arrays.stream(myArray).sum();

		String myArray2[] = { "Syed", "Riyaz", "Uddin", "Avinash" };
		// converting it to Streams
		Stream<String> myString = Arrays.stream(myArray2);

		// converting it to String
		String str = myString.map(Objects::toString)
				.limit(3) //limit to only 3 elements
				.collect(Collectors.joining(","));


		MyLogger.consoleLogger.info("Strings converted from Streams: " + str);
		MyLogger.consoleLogger.info("Sum of myArray [Integers]: " + sum);
	}

}
