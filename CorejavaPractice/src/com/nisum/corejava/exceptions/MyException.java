package com.nisum.corejava.exceptions;
import java.util.Scanner; //importing Scanner Class

//creating a user-defined exception class below

class InvalidAgeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException() {
		super("Invalid Age!  ||| try a valid age");
        // created a constructor that can pass a String to the parent class method using
        // a "super" keyword
	}
}

public class MyException {
    // In this main class, we have created an object of Experiment class.
	public static void main(String[] args) throws InvalidAgeException {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		sc.close(); 

		// Throwing an exception below

		if (age > 40) {
			throw new InvalidAgeException();
		} else {
			System.out.println("Congrats! You're elegible :)");
		}

	}
}
