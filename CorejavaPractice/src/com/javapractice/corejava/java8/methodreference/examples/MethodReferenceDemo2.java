package com.javapractice.corejava.java8.methodreference.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceDemo2 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Syed", "Riyaz", "Avinash", "Rohit");

// Without lambda expression

//		Consumer<String> con = new Consumer<String>() {
//			public void accept(String str) {
//				System.out.println();
//			}
//		};
//		names.forEach(con);

		
        // with Lambda expression
		System.out.println("Using Lamda Expression");
		names.forEach(str -> System.out.println(str));
		
		//replacing Lambda expression with method reference
		System.out.println("\nUsing Method reference");
		names.forEach(System.out::println);

	}
}