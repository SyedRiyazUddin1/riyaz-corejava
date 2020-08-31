package com.corejava.logicprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Program to print the second smallest number in an ArrayList

public class SecondSmallestInAnArrayListDemo {

	// logic to print the second smallest number in an arrayList
	public static int getSecondSmallest(Integer[] a, int total) {
		List<Integer> list = Arrays.asList(a);
		
		Collections.sort(list);
		int element = list.get(1); //after sorting, getting the 2nd smallest element by the index number
		return element;
	} // End of logic

	public static void main(String args[]) {
		Integer array1[] = { 1, 2, 5, 6, 3, 2 };
		
		Integer array2[] = { 44, 66, 99, 77, 33, 22, 55 };

		// initializing the arrays.
		System.out.println("Second Smallest: " + getSecondSmallest(array1, 6));
		System.out.println("Second Smallest: " + getSecondSmallest(array2, 7));
	}
}
