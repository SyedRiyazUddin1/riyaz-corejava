package com.corejava.logicprograms;

//Program to get the max number from an array

public class LargestNumInAnArrayDemo {

	public static void main(String[] args) {

		// Initialize array
		int[] arr = new int[] { 25, 11, 7, 75, 56 };

		// Initialize max with first element of array.
		int max = arr[0];

		// Logic to get the max number from an array
		// Loop through the array
		for (int loop = 0; loop < arr.length; loop++) {
			// Compare elements of array with max
			if (arr[loop] > max)
				max = arr[loop];
		}
		// Logic ends here

		System.out.println("Largest element present in given array: " + max);
	}
}
