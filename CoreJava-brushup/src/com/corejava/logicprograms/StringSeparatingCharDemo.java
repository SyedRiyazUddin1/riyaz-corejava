package com.corejava.logicprograms;

//Program to separate the characters from a string

public class StringSeparatingCharDemo {

	public static void main(String[] args) {

		String string = "characters ";

		// Displays individual characters from given string
		System.out.println("Individual characters from given string: ");

		// Logic to separate the characters
		// Iterate through the string and display individual character
		for (int loop = 0; loop < string.length(); loop++) {
			System.out.print(string.charAt(loop) + " ");
		}
		// End of logic
	}

}
