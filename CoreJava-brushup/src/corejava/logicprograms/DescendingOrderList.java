package com.corejava.logicprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.corejava.util.MyLogger;

public class DescendingOrderList {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 37, 81, 25, 55);

		List<Integer> value = numbers.stream().sorted((num1, num2) -> -num1.compareTo(num2))
				.collect(Collectors.toList());
		
		value.forEach(num -> MyLogger.consoleLogger.info(num));

	}
}