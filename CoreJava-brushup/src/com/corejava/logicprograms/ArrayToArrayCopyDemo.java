package com.corejava.logicprograms;

import com.corejava.util.MyLogger;

/*
 * Program to copy elements of an array from another array
 */

public class ArrayToArrayCopyDemo {

	public static void main(String[] args) {

		// Initializing an array
		int myArr1[] = { 1, 2, 3, 4, 55, 6 };

		// Creating another array myArr2 with size of myArr1
		int myArr2[] = new int[myArr1.length];

		// Copying all elements of one array into another
		for (int loop = 0; loop < myArr1.length; loop++) {
			myArr2[loop] = myArr1[loop];
		}

		// iterating elements of myArr2

		System.out.println("Elements of new array: ");
		for (int i = 0; i < myArr2.length; i++) {
			MyLogger.consoleLogger.info(myArr2[i] + " ");
		}
	}
}
