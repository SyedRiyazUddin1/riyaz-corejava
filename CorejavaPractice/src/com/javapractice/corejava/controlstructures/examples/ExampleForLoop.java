package com.javapractice.corejava.controlstructures.examples;

// Program to find the sum of numbers from 1 to 10.

public class ExampleForLoop {

	public static void main(String[] args) {

		int sum = 0;

	  //using for loop
      //for(initialization; declaration; increment/decrement)
		
		for (int loop = 1; loop <= 10; loop++) {
			sum += loop; // sum = sum + loop
		}

		// printing the value of sum
		System.out.println("Sum = " + sum);
	}
}