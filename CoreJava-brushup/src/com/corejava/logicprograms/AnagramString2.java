package com.corejava.logicprograms;

//Program to check whether strings are 
import java.util.Arrays;

import com.corejava.util.MyLogger;

public class AnagramString2 {
	public static void main(String[] args) {

		/**
		 * Step1: Compare if the lengths of both the strings are equal, if not, then its
		 * not anagram 
		 * Step2: sort the strings, there is no sort method in String class,
		 * so we can put it in an array 
		 * Step3: Compare the sorted strings and check
		 */
		
		String string1 = "momos";
		String string2 = "sommo";

		if (string1.length() != string2.length()) {
			MyLogger.consoleLogger.info("Strings " + string1 + " and " + string2 + " are not anagram");
		}

		else {
			char[] a1 = string1.toCharArray();
			char[] a2 = string2.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(a2);
			boolean anagramCheck = Arrays.equals(a1, a2);
			if (anagramCheck == true) {
				MyLogger.consoleLogger.info("Strings " + string1 + " and " + string2 + " are Anagram");
			} else {
				MyLogger.consoleLogger.info("Strings are not Anagram");
			}
		}

	}
}
