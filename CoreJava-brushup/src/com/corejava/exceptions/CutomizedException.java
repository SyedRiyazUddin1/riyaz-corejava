package com.corejava.exceptions;

import java.util.Scanner;

//creating user-defined exception

class YoungerAgeException extends RuntimeException {
	YoungerAgeException(String msg) {
		super(msg);
	}
}

public class CutomizedException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age to proceed for voting: ");
		int age = sc.nextInt();
		sc.close();
		try {
			if (age < 18) {
				throw new YoungerAgeException("You're not eligble to vote");

			} else {

				System.out.println("You're eligble to vote. Vote sucess!!");
			}
		} catch (YoungerAgeException ex) {
			ex.printStackTrace();
		}

		System.out.println("Thank you for your time.");

	}

}
