package com.corejava.logicprograms;

import java.util.Scanner;

import com.corejava.util.MyLogger;

public class AverageNumDemo {

	public static void main(String args[]) {
		int num1, num2, num3;

		MyLogger.consoleLogger.info("Enter num1 :");

		// The input provided by user is stored in num1,num2 and num3

		Scanner input = new Scanner(System.in);
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();

		int averagenum = (num1 + num2 + num3) / 3;

//printing average of given 3 numbers
		MyLogger.consoleLogger.info("Average of above 3 numbers are :" + averagenum);
		
		input.close();
	}
}
