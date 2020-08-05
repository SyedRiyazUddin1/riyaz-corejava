package com.corejava.logicprograms;

//program to convert int to string

public class ConvertIntToStringDemo {

	public static void main(String[] args) {

		// Method 1:

		int number = 537;

		// using valueOf method
		String result = String.valueOf(number);
		System.out.println("Converted using String.valueOf method: " + result);

		// Method 2:
		int num = 537;
		String str = Integer.toString(num);
		System.out.println("Converted using Integer.toString method: " + str);

		// Method 3
		// Append empty string "" to the integer using + operator
		int num1 = 537;
		System.out.println("Append empty string \"\"  to the integer using + operator: " + num1 + "");
	}

}
