package com.nisum.corejava.exceptions;

//creating a user-defined exception class below

class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		super("Invalid age exception ||| try a valid age");
		// created a constructor that can pass a String to the parent class method using
		// a "super" keyword
	}
}

class ExceptionTest {
	// Created a method in this class which generates an exception named
	// "InvalidAgeException" which we thrown below
	public void process(int age) throws InvalidAgeException {
		if (age > 110) {
			throw new InvalidAgeException();
		} else {
			System.out.println("Congrats! You're elegible :)");
		}

	}
}

//In the below main class, we have created an object of ExceptionTest class.
public class CustomException {
	public static void main(String[] args) throws InvalidAgeException {
		int age;
		age = Integer.parseInt(args[0]);
		ExceptionTest test = new ExceptionTest(); // using this object, we are invoking the above method process//
		test.process(age);
	}
}
