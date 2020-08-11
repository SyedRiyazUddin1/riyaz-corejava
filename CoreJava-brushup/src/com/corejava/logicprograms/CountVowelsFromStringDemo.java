package com.corejava.logicprograms;

import java.util.Scanner;

public class CountVowelsFromStringDemo {

	public static void main(String[] args) {
		
		//taking an input from the user
		Scanner in = new Scanner(System.in);
		System.out.print("Input the string: ");
		String str = in.nextLine();

		System.out.print("Number of  Vowels in the string: " + count_Vowels(str) + "\n");
		
		
	}

	//method which count the number of vowels in a string
	public static int count_Vowels(String str) {
	
		int count = 0;
		for (int loop = 0; loop < str.length(); loop++) {
			if (str.charAt(loop) == 'a' || str.charAt(loop) == 'e' || str.charAt(loop) == 'i' || str.charAt(loop) == 'o'
					|| str.charAt(loop) == 'u') {
				count++;
			}
		}
		return count;
		
		
	}

}
