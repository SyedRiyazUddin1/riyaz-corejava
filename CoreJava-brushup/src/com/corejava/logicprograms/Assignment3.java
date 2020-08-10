package com.corejava.logicprograms;

//Find the even indexed element in a string and check whether it is a vowel or not

public class Assignment3 {

	public static void main(String[] args) {

		String s = "Avinash"; //even index: aiah
		
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {

				if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
						|| s.charAt(i) == 'u')

				{
					System.out.println("Vowels " + s.charAt(i) + " at index " + i);
				}
			}
		}
	}
}
