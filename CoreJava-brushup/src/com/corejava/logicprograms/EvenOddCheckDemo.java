package com.corejava.logicprograms;

import java.util.Scanner;

import com.corejava.util.MyLogger;

public class EvenOddCheckDemo {

	public static void main(String args[]) {
		int num;
		MyLogger.consoleLogger.info("Enter an Integer number:");

		// The input provided by user is stored in num

		Scanner input = new Scanner(System.in);
		num = input.nextInt();

		// If number is divisible by 2 then it's an even number else odd number

		if (num % 2 == 0)
			MyLogger.consoleLogger.info("Entered number is even");
		else
			MyLogger.consoleLogger.info("Entered number is odd");

		input.close();
	}

}
