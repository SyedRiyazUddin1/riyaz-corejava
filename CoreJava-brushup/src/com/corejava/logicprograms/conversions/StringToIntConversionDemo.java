package com.corejava.logicprograms.conversions;

import com.corejava.util.MyLogger;

public class StringToIntConversionDemo {

	public static void main(String[] args) {

		String str = "1234";

		int num1 = Integer.valueOf(str); //returns the instance of Integer class
		int num2 = Integer.parseInt(str);

		MyLogger.consoleLogger.info("String " + str + " converted to int :" + num2);
		MyLogger.consoleLogger.info("String " + str + " converted to int :" + num2);
		
	}

}
