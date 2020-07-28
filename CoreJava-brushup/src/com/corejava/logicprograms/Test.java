package com.corejava.logicprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ASSIGNMENT FROM NAVEEN:
 * 
 * Given an array list which contains integers,remove the duplicates, collect
 * all the even integers from the result list by combining all the even digits,
 * and check whether the result is palindrome or not.
 */

public class Test {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<Integer>();
		myList.add(10);
		myList.add(10);
		myList.add(4);
		myList.add(8);
		myList.add(7);
		myList.add(3);

		List<Integer> resultList = myList.stream().distinct().filter(num -> num % 2 == 0).collect(Collectors.toList());

		StringBuilder sb = new StringBuilder();
		for (Integer num : resultList) {
			sb.append(num);
		}

		String str1 = sb.toString();
		String str2 = sb.reverse().toString();

		if (str1.equalsIgnoreCase(str2) == true) {

			System.out.println(str1 + " and " + str2 + " strings are Palindrome");
		} else {
			System.out.println(str1 + " and " + str2 + " string are not Palindrome");
		}
	}

}
