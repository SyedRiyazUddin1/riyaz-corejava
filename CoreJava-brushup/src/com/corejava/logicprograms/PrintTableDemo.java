package com.corejava.logicprograms;

import java.util.Scanner;

public class PrintTableDemo {

	public static void main(String args[]) {

		int number;
		Scanner input = new Scanner(System.in);

		// input integer number
		System.out.print("Enter an integer postive number: ");
		number = input.nextInt();

		// print table
		System.out.println("Table of " + number + " is ");
		for (int loop = 1; loop <= 10; loop++) {
			System.out.println(number * loop);
		}
	}
}
