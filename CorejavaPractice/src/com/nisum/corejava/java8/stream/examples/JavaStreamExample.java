//In this program, we are iterating, filtering and passing a limit to fix the iteration.

package com.nisum.corejava.java8.stream.examples;

import java.util.stream.*;

public class JavaStreamExample {
	public static void main(String[] args) {
		Stream.iterate(1, element -> element + 1).filter(element -> element % 5 == 0).limit(6)
				.forEach(System.out::println);
	}
	
}
