package com.javapractice.corejava.java8.examples;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {

		System.out.println("Java8 Consumer Example\n");

		Consumer<String> consumer = ConsumerTest::printNames;
		consumer.accept("C++");
		consumer.accept("Java");
		consumer.accept("Python");
		consumer.accept("Javascript");
	}

	private static void printNames(String name) {		
		System.out.println(name);
	}
}