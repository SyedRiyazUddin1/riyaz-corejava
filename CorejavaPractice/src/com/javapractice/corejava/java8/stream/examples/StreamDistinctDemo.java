package com.javapractice.corejava.java8.stream.examples;

import java.util.Arrays;

import com.javapractice.corejava.util.MyLogger;
import java.util.List;
import java.util.stream.Collectors;


public class StreamDistinctDemo {
	public static void main(String[] args) {
		
		List<Integer> numberList=Arrays.asList(1,2,3,4,1,23,3,2,8);
		List<Integer> evenNumbers= numberList.stream().filter(n -> n%2 ==0).distinct().limit(2).collect(Collectors.toList());
		
		MyLogger.consoleLogger.info("Even numbers from the numberList are :"+evenNumbers);

	}
}
