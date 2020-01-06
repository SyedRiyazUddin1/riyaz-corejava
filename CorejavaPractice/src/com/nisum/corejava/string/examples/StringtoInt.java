package com.nisum.corejava.string.examples;

public class StringtoInt {
	public static void main(String[] args) {
		int num1 = 12345678;
		System.out.println("Given number: " + num1);

		String str1 = String.valueOf(num1); // converting Int to String	

		System.out.println("Length of a string: " + str1.length()); // this result shows that Int to String converted
																	// successfully

		StringBuilder str2 = new StringBuilder(str1.substring(4)); // returns str2 = 5678
		String str3 = str1.substring(0, 4); // returns str3 = 1234
		StringBuilder str4 = str2.reverse(); // reversing the string 5678
		String str5 = str3 + str4;
		System.out.println("Final string: " + str5);

		int number = Integer.parseInt(str5); // converting String to Integer

		System.out.println("Converted String to Int: " + number);

		System.out.println("Dividing the number by 2:" + number / 2); // this division shows that the String is again
																		// converted to Integer successfully
	}
}