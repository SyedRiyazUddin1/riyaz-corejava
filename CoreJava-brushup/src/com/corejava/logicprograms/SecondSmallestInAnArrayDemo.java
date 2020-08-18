package com.corejava.logicprograms;

import java.util.Arrays;

//Program to print the second smallest number in an array

public class SecondSmallestInAnArrayDemo {

	// logic to print the second smallest number in an array
	public static int getSecondSmallest(int[] a) {
		Arrays.sort(a);
		return a[1];
	} // End of logic

	public static void main(String args[]) {

		// initializing the arrays
		int array1[] = { 1, 2, 5, 6, 9, 2 };
		int array2[] = { 44, 66, 88, 77, 33, 22, 55 };

		System.out.println("Second Smallest number in array1: " + getSecondSmallest(array1));
		System.out.println("Second Smallest number in array1: " + getSecondSmallest(array2));
	}
}


