package com.corejava.logicprograms;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {

		int number = 10, count = 1, total = 0;

		while (count <= number) {
			total = total + count;
			count++;
		}

		System.out.println("Sum of first 10 natural numbers is: " + total);
	}

}
