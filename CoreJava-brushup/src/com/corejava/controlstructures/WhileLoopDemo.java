package com.corejava.controlstructures;

import java.util.Scanner;

public class WhileLoopDemo {
	
	public static void main(String[] args) {
		// taking inputs from keyboard
		Scanner keyboard = new Scanner(System.in);
		int pin = 12;

		System.out.println("WELCOME TO THE STATE BANK OF INDIA.\n ENTER YOUR PIN: ");
	
		int entry = keyboard.nextInt();

		while (entry != pin) {
			System.out.println("\nINCORRECT PIN. TRY AGAIN.\n ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
		keyboard.close();
	}

}
