package com.corejava.logicprograms;

import com.corejava.util.MyLogger;

public class VowelsCount {
	static int loop, c, vowels;

	// method which counts vowels from a string
	static int vowelcount(String str) {
		for (loop = 0, c = 0; loop < str.length(); loop++) {
			char ch = str.charAt(loop);
			if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u'))
				c++;
		}
		return c;
	}

	public static void main(String args[]) {

		MyLogger.consoleLogger.info("Original String is : manchester united is also known as red devil ");

		vowels = VowelsCount.vowelcount("   manchester united is also known as red devil ");
		MyLogger.consoleLogger.info("The number of vowels in the string is  :" + vowels);
	}
}
