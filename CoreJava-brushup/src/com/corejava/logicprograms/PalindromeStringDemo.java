package com.corejava.logicprograms;

import com.corejava.util.MyLogger;

public class PalindromeStringDemo {

	public static void main(String[] args) {

		// one way with StringBuilder

		StringBuilder sb = new StringBuilder("bob");

		if (sb.reverse().equals(sb)) {
			MyLogger.consoleLogger.info("String is Palindrome");
		}

		else {
			MyLogger.consoleLogger.info("String is NOT Palindrome");
		}
		
		//another way
		
		

	}
}
