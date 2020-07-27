package com.corejava.logicprograms;

import com.corejava.util.MyLogger;

public class PrimeNumCheck {

	public static void main(String[] args) {

		MyLogger.consoleLogger.info("17 is prime number?: " + isPrime(17));
		MyLogger.consoleLogger.info("2 is prime number?: " + isPrime(2));
		MyLogger.consoleLogger.info("91 is prime number?: " + isPrime(91));
		MyLogger.consoleLogger.info("29 is prime number?: " + isPrime(29));
		MyLogger.consoleLogger.info("81 is prime number?: " + isPrime(81));
	}

	public static boolean isPrime(int number) {
		for (int loop = 2; loop <= Math.sqrt(number); loop++) {
			if (number % loop == 0)
				return false;
		}
		return true;

	}
}
