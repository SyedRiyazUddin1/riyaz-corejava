package com.corejava.controlstructures;

import com.corejava.util.MyLogger;

public class TernaryOpDemo {

	public static void main(String[] args) {

		int num = 9;

		// using ternary operator, if num is greater than 10, it will print the first
		// part, else the second part

		MyLogger.consoleLogger.info(num > 10 ? "num is greater than 10" : "num is lesser than 10");
	}
}
