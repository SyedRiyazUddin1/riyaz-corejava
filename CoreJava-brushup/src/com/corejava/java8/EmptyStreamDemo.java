package com.corejava.java8;

import java.util.stream.Stream;

public class EmptyStreamDemo {
	public static void main(String[] args) {

		Stream<String> stream = Stream.empty(); // creates an empty stream.
		stream.forEach(System.out::println); // method reference
	}

}
