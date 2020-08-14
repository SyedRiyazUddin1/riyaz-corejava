package com.corejava.logicprograms;

/*
 * Program to add 2 dimensional arrays
 */

public class Adding2DArraysDemo {

	public static void main(String[] args) {
		
		// Declaration and initialization of 2D array
		int array1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		int array2[][] = { { 7, 8, 9 }, { 10, 11, 12 } };

		// Instantiation of third array to store results
		int array3[][] = new int[2][3];

		for (int loop = 0; loop < 2; ++loop) {
			for (int j = 0; j < 3; ++j) {
				// add two array and result store in third array
				array3[loop][j] = array1[loop][j] + array2[loop][j];
				System.out.println("Enter sum of " + loop + " " + j + "index" + " " + array3[loop][j]);
			}
		}
	}
}
