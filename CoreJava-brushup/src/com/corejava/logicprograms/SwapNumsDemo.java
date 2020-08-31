package com.corejava.logicprograms;

//swapping the numbers by taking the inputs from the user.
import java.util.Scanner;

import com.corejava.util.MyLogger;

public class SwapNumsDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		MyLogger.consoleLogger.info("Enter the 1st number: ");
		int num1 = sc.nextInt();
		
		MyLogger.consoleLogger.info("Enter the 2nd number: ");
		int num2 = sc.nextInt();

		MyLogger.consoleLogger.info("Original value of num1: " + num1 + " and num2: " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		MyLogger.consoleLogger.info("After swapping value of num1: " + num1 + " and num2: " + num2);

		sc.close();
	}
}
