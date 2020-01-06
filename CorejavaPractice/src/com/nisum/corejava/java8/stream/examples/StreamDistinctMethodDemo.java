/**
 * 
 */
package com.nisum.corejava.java8.stream.examples;

import java.util.Arrays;
import java.util.List;

/**
 * @author Riyaz
 *
 */
public class StreamDistinctMethodDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5);

		System.out.println("The distinct elements are :");

		// Displaying the distinct elements in the list
		// using Stream.distinct() method

		list.stream().distinct().forEach(System.out::println);
	}

}
