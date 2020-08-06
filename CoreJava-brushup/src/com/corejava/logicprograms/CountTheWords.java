package com.corejava.logicprograms;

//program to count the words in a string

public class CountTheWords {

	public static void main(String[] args) {
		String str = "My Name is Riyaz";

		String[] words = str.trim().split(" ");

		System.out.println("Number of words in the string = " + words.length);

		System.out.println("Words are:");
		for (int loop = 0; loop < words.length; loop++) {
			System.out.println(words[loop]);
		}
	}
}
