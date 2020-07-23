package com.corejava.logicprograms;

import com.corejava.util.MyLogger;

public class StringsEqualDemo {

	public static void main(String[] args) {

		String s1 = "Syed";
		String s2 = "sYeD";

		if (s1.equalsIgnoreCase(s2) == true) {

			MyLogger.consoleLogger.info("Both strings are equal");

		} else {
			MyLogger.consoleLogger.info("Strings are not equal");
		}

	}
}
