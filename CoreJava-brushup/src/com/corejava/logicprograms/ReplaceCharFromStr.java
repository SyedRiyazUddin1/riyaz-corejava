package com.corejava.logicprograms;

import com.corejava.util.MyLogger;

//placing characters from a String and to lowercase it

public class ReplaceCharFromStr {

	public static void main(String[] args) {

		String str = "Breathe Into The Shadows";
		String newStr = str.replace("a", "x");

		// lower casing it
		MyLogger.consoleLogger.info(newStr.toLowerCase());

	}
}
