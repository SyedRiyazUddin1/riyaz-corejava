package com.corejava.logicprograms;

//program to remove space from the beginning and ending if a String

import com.corejava.util.MyLogger;

public class RemoveSpaceFromStr {

	public static void main(String[] args) {

		String str1 = "    I love Hyderabad   ";

		String str2 = str1.trim();

		MyLogger.consoleLogger.info("Lenght of str1 is " + str1.length());
		MyLogger.consoleLogger.info("Lenght of str1 is " + str2.length());
	}

}
