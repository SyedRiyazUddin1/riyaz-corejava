package com.corejava.logicprograms;

//program to find the average of numbers in an array

public class AvgOfArrayOfNumDemo {

	public static void main(String[] args) {
		
		double[] arr = { 19, 12.89, 16.5, 200, 13.7 };
		double total = 0;

		//converting an array to double
		for (int loop = 0; loop < arr.length; loop++) {
			total = total + arr[loop];
		}

		/*
		 * arr.length returns the number of elements present in the array
		 */
		double average = total / arr.length;

		System.out.format("The average of numbers in an array is: "+ average);
	}
}
