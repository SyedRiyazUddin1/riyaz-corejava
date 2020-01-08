package com.nisum.corejava.arrays.examples;

public class MultiDimensionalArrayDemo {
	public static void main(String[] args) {

		//declaring multi dimensional
		double myArray[][] = { { 1.2, 4.3, 4.0 }, { 4.1, 1.1, 1.5 }, { 1, 4, 3.5 } };

		for (int count = 0; count < 3; count++) {
			for (int count1 = 0; count1 < 3; count1++) {

				System.out.print(myArray[count][count1] + " ");
			}

			System.out.println();
		}
	}
}
