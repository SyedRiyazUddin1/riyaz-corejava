package com.nisum.corejava.exceptions;
import java.util.Scanner; //importing Scanner Class

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
