//In this program, we are iterating, filtering and passing a limit to fix the iteration.

package com.javapractice.corejava.java8.trainingsession.examples;

import java.util.stream.*;

public class JavaStreamExample {
	public static void main(String[] args) {
		Stream.iterate(1, element -> element + 1).filter(element -> element % 5 == 0).limit(6)
				.forEach(System.out::println);
	}
	
}
