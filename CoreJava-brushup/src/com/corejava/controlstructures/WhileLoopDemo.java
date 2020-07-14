package com.corejava.controlstructures;

import java.util.Scanner;

import com.corejava.util.MyLogger;

public class WhileLoopDemo {
	
	public static void main(String[] args) {
		// taking inputs from keyboard
		Scanner keyboard = new Scanner(System.in);
		int pin = 12;

		MyLogger.consoleLogger.info("WELCOME TO THE STATE BANK OF INDIA.\n ENTER YOUR PIN: ");
	
		int entry = keyboard.nextInt();

		while (entry != pin) {
			MyLogger.consoleLogger.info("\nINCORRECT PIN. TRY AGAIN.\n ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}

		MyLogger.consoleLogger.info("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
		keyboard.close();
	}

}
