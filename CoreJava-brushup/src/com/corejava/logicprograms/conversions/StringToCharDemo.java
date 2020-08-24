package com.corejava.logicprograms.conversions;

import com.corejava.util.MyLogger;

//Program to convert String to Char

public class StringToCharDemo {

	public static void main(String[] args) {

		char c1 = 'r';
		// converting Char to String
		String str1 = String.valueOf(c1);
		MyLogger.consoleLogger.info("char " + c1 + " converted to String :" + str1);

		// converting String to char
		String str2 = "Riyaz";
		char c2 = str2.charAt(0); // returns only 1 character
		MyLogger.consoleLogger.info("String " + str2 + " converted to char :" + c2);

		// logic to convert String to the char
		for (int loop = 0; loop < str2.length(); loop++) {
			char c3 = str2.charAt(loop);
			System.out.println("char at " + loop + " index is: " + c3);
		}

	}

}
