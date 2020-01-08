package com.nisum.corejava.arrays.examples;

public class MultiD_ArraysDemo2 {

	public static void main(String args[]) {

		double myArray[][] = {

				{ 0 * 0, 1 * 0, 2 * 0, 3 * 0 }, 
				{ 0 * 1, 1 * 1, 2 * 1, 3 * 1 }, 
				{ 0 * 2, 1 * 2, 2 * 2, 3 * 2 },
				{ 0 * 3, 1 * 3, 2 * 3, 3 * 3 }

		};

		int loop1, loop2;
		
        //using for loop
		for (loop1 = 0; loop1 < 4; loop1++) {
			for (loop2 = 0; loop2 < 4; loop2++) {
				System.out.print(myArray[loop1][loop2] + "   ");
			}
			System.out.println();
		}

	}
}
