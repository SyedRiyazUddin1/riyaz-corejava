package com.corejava.logicprograms;

import java.util.Scanner;

import com.corejava.util.MyLogger;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str1, str2 = "";
		MyLogger.consoleLogger.info("Enter the string :");

		str1 = sc.nextLine();

		for (int loop = str1.length() - 1; loop >= 0; loop--) {
			str2 = str2 + str1.charAt(loop);
		}

		MyLogger.consoleLogger.info("Reverse of the entered string is :" + str2);

	}

}
