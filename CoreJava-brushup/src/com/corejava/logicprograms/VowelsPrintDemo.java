package com.corejava.logicprograms;

public class VowelsPrintDemo {

	public static void main(String[] args) {

		// given string
		String str = "Syed Riyaz Uddin";

		// all vowels
		String vowels = "aeiou";

		System.out.print("Vowels in the string are: ");
		/*
		 * Using indexOf method of String class to check if it
		 * contains a character. This method will return -1 if the character does not
		 * exist in the string, otherwise its index(or position) in the string.
		 */
		
		// iterate over the characters in string
		for (char character : str.toLowerCase().toCharArray()) {
			// check if current character is a vowel
			if (vowels.indexOf(character) != -1) {
				System.out.print(character + " ");
			}
		}
	}
}
