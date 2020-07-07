package com.corejava.strings;

public class ReplaceCharDemo {

	/**
	 * Replacing characters from a String and to lowercase it
	 */

	public static void main(String[] args) {
		String str = "Netflix is better than Prime";
		// MyLogger.consoleLogger.info(str.replace("i", "o"));

		System.out.println((str.replace("i", "o")));
		// lower casing it
		System.out.println(str.toLowerCase());

	}
}
