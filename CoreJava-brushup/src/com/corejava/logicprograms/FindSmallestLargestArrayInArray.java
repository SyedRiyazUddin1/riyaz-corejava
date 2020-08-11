package com.corejava.logicprograms;

import com.corejava.util.MyLogger;

public class FindSmallestLargestArrayInArray {

	public static void main(String[] args) {

		// creating an array of 10 numbers
		int arr[] = new int[] { 12, 56, 76, 89, 100, 343, 21, 234 };

		// assign first element of an array to largest and smallest
		int smallest = arr[0];
		int largest = arr[0];

		// logic to check the largest and smallest array
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest)
				largest = arr[i];
			else if (arr[i] < smallest)
				smallest = arr[i];
		}
		// end of the logic

		MyLogger.consoleLogger.info("Smallest Number is : " + smallest);
		MyLogger.consoleLogger.info("Largest Number is : " + largest);
	}

}
