package com.nisum.corejava.exceptions;
import java.util.Scanner; //Importing Scanner class

class IncorrectPinException extends Exception {
	public IncorrectPinException() {
		super("Incorrect Pin!  ||| Enter a valid pin");
	}
}

class BankAccount {
	public static void main(String[] args) throws IncorrectPinException {
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO SBI");
		System.out.print("ENTER YOUR PIN:");
		int entry = keyboard.nextInt();
		keyboard.close(); 

		if (entry != pin)
			throw new IncorrectPinException();
		else {
			System.out.println("PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
		}

	}
}
