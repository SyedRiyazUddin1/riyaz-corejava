package com.corejava.logicprograms;

import com.corejava.util.MyLogger;

//Program to print odd positioned elements in an array.

public class OddPositionElementsOfArrayDemo {

	public static void main(String[] args) {

		int myArray[] = { 1, 3, 5, 9, 7, 11, 12, 14 };

		// Logic starts here

		/*
		 * Loop through the array by incrementing value of i by 2 Here, will start from
		 * 1 as first even positioned element is present at position 1.
		 */

		for (int loop = 0; loop < myArray.length; loop = loop + 2) {
			MyLogger.consoleLogger.info(myArray[loop]);
		}
		
		//End of logic here

	}

}
