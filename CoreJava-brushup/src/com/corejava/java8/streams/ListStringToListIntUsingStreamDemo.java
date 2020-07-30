package com.corejava.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.corejava.util.MyLogger;

public class ListStringToListIntUsingStreamDemo {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 4, 6, 9, 12, 15, 19, 21, 26, 30);
		
		MyLogger.consoleLogger.info("List of integers: "+numbers);
		
		List<String> str = numbers.stream().map(num->String.valueOf(num)).collect(Collectors.toList());
		MyLogger.consoleLogger.info("List of integers converted to strings: "+str);
		

	}
}