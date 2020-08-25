package com.corejava.logicprograms;

import com.corejava.util.MyLogger;

//program to find largest number among the given 3 numbers

public class LargestAmong3numDemo {

	public static void main(String[] args) {

		double num1 = -4.5, num2 = 3.9, num3 = 2.5;

		if (num1 >= num2 && num1 >= num3)
			MyLogger.consoleLogger.info(num1 + " is the largest number.");

		else if (num2 >= num1 && num2 >= num3)
			MyLogger.consoleLogger.info(num2 + " is the largest number.");

		else
			MyLogger.consoleLogger.info(num3 + " is the largest number.");
	}
}
