package com.corejava.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.corejava.util.MyLogger;

/**
 * No need to create this class when using Lambda expression
 * 
 * class MyComparator implements Comparator<Integer> {
 * 
 * @Override public int compare(Integer num1, Integer num2) {
 * 
 *           // using ternary operator return ((num1 < num2) ? -1 : (num1 >
 *           num2) ? 1 : 0); } }
 */

public class ComparatorLambdaDemo {
	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<Integer>();

		myList.add(20);
		myList.add(10);
		myList.add(35);
		myList.add(45);
		myList.add(5);

		MyLogger.consoleLogger.info(myList);

		// sorting the list in ascending order
		/** Collections.sort(myList, new MyComparator()); */

		// using Lambda Expression, sorting in ascending order
		//Comparator<Integer> comp = (num1, num2) -> (num1 < num2) ? -1 : (num1 > num2) ? 1 : 0;

		// using Lambda Expression, sorting in descending order
		Comparator<Integer> comp = (num1, num2) -> (num1 < num2) ? 1 : (num1 > num2) ? -1 : 0;

		Collections.sort(myList, comp); 

		MyLogger.consoleLogger.info(myList);

		// using Streams, iterating myList with forEach method
		myList.stream().forEach(System.out::println);

	}
}
