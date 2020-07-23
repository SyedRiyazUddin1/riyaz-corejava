package com.corejava.logicprograms;

import com.corejava.util.MyLogger;

public class ReverseString2 {

	public static void main(String[] args) {

		String s1 = "Riyaz";
		String s1reverse = "";

		for (int i = s1.length() - 1; i >= 0; i--) {
			s1reverse = s1reverse + s1.charAt(i);
		}
		MyLogger.consoleLogger.info("reverse string :" + s1reverse);

	}

}
