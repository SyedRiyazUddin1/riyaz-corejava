package com.corejava.java8.streams;

//program to iterate and limit a stream

import java.util.stream.Stream;

public class StreamIterateDemo {

	public static void main(String[] args) {
		Stream.iterate(1, element -> element + 1) //this iterates to infinity by adding 1
		.filter(element -> element % 5 == 0) //filtering objects which are only divisible by 5
		.limit(6) //limiting it to 6 elements
		.skip(2) //skips the first two elements
		.forEach(System.out::println); //iterating and printing the elements.
	}

}
