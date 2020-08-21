package com.corejava.logicprograms;

import com.corejava.util.MyLogger;

//Program to get the minimum number from an array

public class SmallestNumInAnArrayDemo {

	public static void main(String[] args) {
		
		// Initialize array
		int arr[] = new int[] { 14, 19, 26, 6, 44 };

		// Initialize max with first element of array.
		int min = arr[0];

		// Logic to get the min number from an array
	    // Loop through the array
		for (int loop = 0; loop < arr.length; loop++) {
			//compare elements of array with max
			if (arr[loop] < min) {
				min = arr[loop];
			}
			// Logic ends here
		}
		MyLogger.consoleLogger.info(min);
	}

}
