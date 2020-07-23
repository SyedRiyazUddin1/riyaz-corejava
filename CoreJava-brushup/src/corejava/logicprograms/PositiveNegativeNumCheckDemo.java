package com.corejava.logicprograms;

//Checking Whether a Number is Positive or Negative, also find even/odd.
import com.corejava.util.MyLogger;

public class PositiveNegativeNumCheckDemo {

	public static void main(String[] args) {

		int number =17;

		if (number <0 && number/2==0) {
			MyLogger.consoleLogger.info("Given number is negative and even");
		} else {
			MyLogger.consoleLogger.info("Given number is positive and Odd");
		}
	}

}
