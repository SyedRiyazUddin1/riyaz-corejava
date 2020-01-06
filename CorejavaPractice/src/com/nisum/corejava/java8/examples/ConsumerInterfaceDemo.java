package com.nisum.corejava.java8.examples;

import java.util.function.Consumer;

public class ConsumerInterfaceDemo {
	
	public static void main(String[] args) {
		Consumer<Integer> consumer = (t) -> System.out.println("Printing..."+ t);
		consumer.accept(10);	
	}
	
}
