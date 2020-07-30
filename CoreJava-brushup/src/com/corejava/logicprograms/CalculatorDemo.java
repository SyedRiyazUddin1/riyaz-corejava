package com.corejava.logicprograms;

import java.util.Scanner;

import com.corejava.util.MyLogger;

public class CalculatorDemo {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		MyLogger.consoleLogger.info("Enter two numbers: ");
		
		// nextDouble() reads the next double from the keyboard
		double first = reader.nextDouble();
		double second = reader.nextDouble();
		
		MyLogger.consoleLogger.info("Enter an operator (+, -, *, /): ");
		char operator = reader.next().charAt(0);
		double result;
		
		// switch case for each of the operations
		switch (operator) {
		case '+':
			result = first + second;
			break;
			
		case '-':
			result = first - second;
			break;
			
		case '*':
			result = first * second;
			break;
			
		case '/':
			result = first / second;
			break;
		// operator doesn't match any case constant (+, -, *, /)

		default:
			MyLogger.consoleLogger.info("Error! operator is not correct");
			return;
		}
		// printing the result of the operations
		MyLogger.consoleLogger.info(first+" "+operator+ " "+second +" = "+result);
	}
}

