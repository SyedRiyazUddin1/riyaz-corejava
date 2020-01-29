package com.javapractice.corejava.string.examples;

public class StringtoInt {
	public static void main(String[] args) {
		int num1 = 12345678;
		System.out.println("Given number: " + num1);

		// converting Int to String
		String str1 = String.valueOf(num1); 

		// this result shows that Int to String converted successfully
		System.out.println("Length of a string: " + str1.length()); 

		// returns str2 = 5678
		StringBuilder str2 = new StringBuilder(str1.substring(4)); 
		
		// returns str3 = 1234
		String str3 = str1.substring(0, 4); 
		
		// reversing the string 5678
		StringBuilder str4 = str2.reverse(); 
		
		String str5 = str3 + str4;
		System.out.println("Final string: " + str5);

		// converting String to Integer
		int number = Integer.parseInt(str5); 

		System.out.println("Converted String to Int: " + number);

		// this division shows that the String is again converted to Integer successfully
		System.out.println("Dividing the number by 2:" + number / 2); 
	}
}