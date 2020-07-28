package com.corejava.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.corejava.util.MyLogger;

public class StreamsMethodsDemo {

	public static void main(String[] args) {

		List<Integer> numbersList = new ArrayList<Integer>();
		numbersList.add(80);
		numbersList.add(68);
		numbersList.add(30);
		numbersList.add(38);
		numbersList.add(10);
		numbersList.add(25);

		MyLogger.consoleLogger.info(numbersList);

		// filtering numbers less than 38, multiplying it by 2 and sorting it.

		List<Integer> newList = numbersList.stream().filter(m -> m < 38).map(num -> num * 2).sorted()
				.collect(Collectors.toList());
		MyLogger.consoleLogger.info(newList);

		// count method returns the no. of elements present in the Stream
		long noOfElements = newList.stream().count();
		MyLogger.consoleLogger.info("Number of elements: "+noOfElements);

		// Descending order, for ascending, just need to write sorted() with no args

		List<Integer> descendOrderList = numbersList.stream()
				.sorted((num1, num2) -> ((num1 < num2) ? 1 : (num1 > num2) ? -1 : 0)).collect(Collectors.toList());
		MyLogger.consoleLogger.info("List in Descending order: "+descendOrderList);
		

	}
}
