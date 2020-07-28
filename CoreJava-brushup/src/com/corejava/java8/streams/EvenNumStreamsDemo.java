package com.corejava.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.corejava.util.MyLogger;

public class EvenNumStreamsDemo {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		myList.add(0);
		myList.add(6);
		myList.add(7);
		myList.add(4);
		myList.add(28);
		myList.add(17);

		MyLogger.consoleLogger.info(myList);

//		before Java 1.8
//		List<Integer> evenList = new ArrayList<Integer>();
//		for (Integer num : myList) {
//
//			if (num % 2 == 0) {
//				evenList.add(num);
//			}
//		}
//		MyLogger.consoleLogger.info(evenList);

		List<Integer> evenList = myList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		MyLogger.consoleLogger.info(evenList);

		// Iterating the list using forEach() method

		evenList.forEach(num -> MyLogger.consoleLogger.info(num));
		

	}

}
