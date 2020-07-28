package com.corejava.logicprograms;
//Printing the substring of a string

import com.corejava.util.MyLogger;

public class SubstringOfStringDemo {

	public static void main(String[] args) {

		String str1 = "Old McDonald had a farm";

		String str2 = str1.substring(4, 12);

		MyLogger.consoleLogger.info(str2);
	}

}
