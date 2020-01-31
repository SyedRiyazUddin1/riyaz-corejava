
//Program on different ways to create Stream:

package com.javapractice.corejava.java8.stream.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamBuilder {

	public static void main(String[] args) {

		// one way of creating stream
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
		System.out.println("Creating stream");
		stream.forEach(p -> System.out.println(p));

		// creating Stream of Array of elements
		Stream<Integer> stream1 = Stream.of(new Integer[] { 6, 7, 8, 9 });
		System.out.println("Stream.of(arrayOfElements)");
		stream1.forEach(p -> System.out.println(p));

		// creating stream of List
		List<Integer> list = new ArrayList<Integer>();
		for (int loop = 0; loop <= 8; loop++) {
			list.add(loop);
		}
		Stream<Integer> stream2 = list.stream();
		System.out.println("List.stream()");
		stream2.forEach(p -> System.out.println(p));

		
		// splitting char from a String
		Stream<String> stream5 = Stream.of("A$B$C$".split("\\$"));
		System.out.println("Char split from String stream");
		stream5.forEach(p -> System.out.println(p));

	}
}
