package com.corejava.logicprograms;

import java.util.Scanner;

import com.corejava.util.MyLogger;

public class PalindromeStringCheck {

	public static void main(String[] args) {

		String str1, str2 = "";

		Scanner sc = new Scanner(System.in);
		MyLogger.consoleLogger.info("Enter the string you want to check:");
		str1 = sc.nextLine();

		// adding characters in str2 in reverse

		for (int loop = str1.length() - 1; loop >= 0; loop--) {
			str2 = str2 + str1.charAt(loop);
		}

		if (str1.equalsIgnoreCase(str2)) {
			MyLogger.consoleLogger.info("The string is palindrome.");
		} else {
			MyLogger.consoleLogger.info("The string is not palindrome.");
		}

		sc.close();
	}

}
