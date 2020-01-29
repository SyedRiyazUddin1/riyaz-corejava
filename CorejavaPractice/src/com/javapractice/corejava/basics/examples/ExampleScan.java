package com.javapractice.corejava.basics.examples;

import java.util.Scanner;

import com.javapractice.corejava.util.MyLogger;

public class ExampleScan {

	public static void main(String[] args) {
		
		MyLogger.consoleLogger.trace("Trace Message!");
		MyLogger.consoleLogger.debug("Debug Message!");
		MyLogger.consoleLogger.info("Info Message!");
		MyLogger.consoleLogger.warn("Warn Message!");
		MyLogger.consoleLogger.error("Error Message!");
		MyLogger.consoleLogger.fatal("Fatal Message!");
		
		double fname, lname, fullName;
		Scanner sc = new Scanner(System.in);
		
		MyLogger.consoleLogger.info("Enter First number: ");
		fname = sc.nextDouble();
		
		MyLogger.consoleLogger.info("Enter Second number: ");
		lname = sc.nextDouble();
		fullName = fname + lname;
		sc.close();
		MyLogger.consoleLogger.info("Sum of these two numbers are: " + fullName);
	}
}
