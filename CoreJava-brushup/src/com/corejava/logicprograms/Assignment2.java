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
		String result = "";

		// reversing str1
		for (int loop = str1.length() - 1; loop >= 0; loop--) {

			reverse1 = reverse1 + str1.charAt(loop);
		}
		// reversing str2
		for (int i = str2.length() - 1; i >= 0; i--) {
			reverse2 = reverse2 + str2.charAt(i);
		}

		String combined = reverse1 + reverse2;
		
		//converting String to String array
		
		String strArray[]= new String[] {combined};
		
		 //print even indexed elements of String array
		 for(int i=1; i < strArray.length; i=i){
		 System.out.println(strArray[i]);
		 }
	}
}
