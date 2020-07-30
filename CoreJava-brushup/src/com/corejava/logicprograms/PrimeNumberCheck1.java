package com.corejava.logicprograms;

import java.util.Scanner;

public class PrimeNumberCheck1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out
				.println("Enter a number greater than 2 which you want to check whether that number is prime or not: ");
		int p1 = in.nextInt();
		int count = 2;
		for (; count < 10; count++) {
			if (p1 % count == 0 && p1 != count) {
				System.out.println("Entered number " + p1 + " is not a prime number.");
				break;
			}
		}
		if (count == 10) {
			System.out.println("Entered number " + p1 + " is a prime number.");
		}
		
		in.close();
	}
}