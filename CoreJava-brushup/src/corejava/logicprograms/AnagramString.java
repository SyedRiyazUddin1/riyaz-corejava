package com.corejava.logicprograms;

import java.util.Arrays;

import com.corejava.util.MyLogger;

public class AnagramString {

	public static void main(String[] args) {

		String s1 = "farhan";
		String s2 = "farnah";

		/**
		 * Step:1 sort the strings, there is no sort method in String class, so we can
		 * put it in an array Step:2 is to compare the sorted strings and check
		 */

		String[] s3 = { "farhan" };
		String[] s4 = { "farnah" };

		// sorting the above arrays
		Arrays.sort(s3);
		Arrays.sort(s4);

//		converting an array to String
		String s5 = s3.toString();
		String s6 = s4.toString();
		
//		String s5 = Arrays.deepToString(s3);
//		String s6 = Arrays.deepToString(s4);
//		


		// comparing the strings
		if (s5.equalsIgnoreCase(s6)) {
			MyLogger.consoleLogger.info("String is Anagram");
		} else {
			MyLogger.consoleLogger.info("String is not Anagram");
		}
		MyLogger.consoleLogger.info(s4); //output :[Ljava.lang.String;@15db9742
		//if you want to print the content instead of hascode
		
	}
}
