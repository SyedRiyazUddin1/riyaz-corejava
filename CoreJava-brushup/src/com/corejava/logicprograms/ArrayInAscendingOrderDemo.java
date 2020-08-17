package com.corejava.logicprograms;

import java.util.Arrays;
import java.util.Collections;

import com.corejava.util.MyLogger;

/*
 * Program to print array in Ascending order
 */
public class ArrayInAscendingOrderDemo {

	public static void main(String[] args) {

		// initializing an array
		int myArray[] = { 13, 19, 14, 4, 17, 9, 22 };

		/** logic to print an array in ascending order using for loop */
//		int temp = 0;
//		for (int loop1 = 0; loop1 < myArr1.length; loop1++) {
//			for (int loop2 = loop1 + 1; loop2 < myArr1.length; loop2++) {
//				if (myArr1[loop1] > myArr1[loop2]) {
//					temp = myArr1[loop1];
//					myArr1[loop1] = myArr1[loop2];
//					myArr1[loop2] = temp;
//				}}}
		/** end of logic here */

		/** Using sort method */
		// invoking sort() method of the Arrays class
		Arrays.sort(myArray);

		// Displaying elements of array after sorting
		MyLogger.consoleLogger.info("Elements of array sorted in ascending order: ");
		for (int loop = 0; loop < myArray.length; loop++) {
			MyLogger.consoleLogger.info(myArray[loop] + " ");
		}

		// Sorting array in Descending order
		Integer[] array = { 23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205 };
		
		// sorts array[] in descending order
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println("Array elements in descending order: " + Arrays.toString(array));
	}
}
