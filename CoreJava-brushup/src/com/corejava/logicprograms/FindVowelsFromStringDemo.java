package com.corejava.logicprograms;

/*
 * Program to find the vowels from a string
 */

public class FindVowelsFromStringDemo {

	public static void main(String[] args) {

		// Creating a string
		String str = new String("Hi Welcome to my sweet home");

		/*
		 * Logic to find the vowels from a string
		 */

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {

				System.out.println("Given string contains " + str.charAt(i) + " at the index " + i);
			}
		}
		// End of logic
	}

}
