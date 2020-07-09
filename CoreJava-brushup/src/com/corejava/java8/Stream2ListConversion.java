package com.corejava.java8;

//Converting Stream to List

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2ListConversion {

	public static void main(String[] args) {
		// creating List
		List<Integer> EmpList = new ArrayList<Integer>();
		for (int i = 1; i <= 12; i++) {
			EmpList.add(i);
		}
		Stream<Integer> stream = EmpList.stream(); // created stream of List

//	         stream.forEach(i -> System.out.println(i)); can't reuse the stream, will get IllegalStateException here.

		// converting Stream to List again and , multiplying it and collecting
		List<Integer> evenNumbersList = stream.filter(numbers -> numbers % 2 == 0) // filtering only even numbers
																					// list
				.map(s -> s * s)// multiplying the list by 2
				.distinct().skip(3) // skips the starting three objects
				.collect(Collectors.toList()); // Collecting the stream and converting it in list
		System.out.println(evenNumbersList);

	}
}
