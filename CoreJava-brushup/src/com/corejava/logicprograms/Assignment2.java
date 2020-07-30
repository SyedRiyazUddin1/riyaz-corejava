package com.corejava.logicprograms;

/**
 * Reverse both String 1 and String2, combine both strings into single string,
 * collect all the characters from the index which are divisible by 3, merge all
 * the char and return the string
 */

public class Assignment2 {

	public static void main(String[] args) {

		String str1 = "SyedRiyazUddin";
		String str2 = "AvinashEdmadakala";

		String reverse1 = "";
		String reverse2 = "";

		for (int loop = str1.length()-1; loop >= 0; loop--) {

			reverse1 = reverse1 + str1.charAt(loop);
		}

		for (int loop = 0; loop >= str1.length(); loop--) {

			reverse2 = reverse2 + str2.charAt(loop);
		}
		
		System.out.println("reverse of string 1 : "+reverse1);
		System.out.println(reverse2);

	}
}
