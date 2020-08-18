package com.corejava.logicprograms;

//Program to print the sum of elements in an array

public class SumOfArray {

	public static void main(String[] args) {

		// Initializing an array
		int[] arr = new int[] { 1, 2, 3, 4, 5,15 };
		int sum = 0;

		// Logic starts here
		// Looping through the array to calculate sum of elements
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		// End of logic

		System.out.println("Sum of all the elements of an array: " + sum);
	}
}
