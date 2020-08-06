package com.corejava.logicprograms;

//class to reverse a string

public class ReverseString2 {

	public static void main(String[] args) {
		
		String str = "Riyaz";
		String reverse = "";
		
		for (int loop = str.length() - 1; loop >= 0; loop--) {
			reverse = reverse + str.charAt(loop);
		}
		System.out.println("Reverse of Happy is:" + reverse);
	}
}
