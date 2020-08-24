package com.corejava.logicprograms.conversions;

//Program to convert String to Int and Integer and vice versa

import com.corejava.util.MyLogger;

public class StringToIntConversionDemo {

	public static void main(String[] args) {

		String str = "1234";

		int num1 = Integer.valueOf(str); //returns the instance of Integer class
		MyLogger.consoleLogger.info("String " + str + " converted to int :" + num1);
		
		
		int num2 = Integer.parseInt(str);//converts String to int
		MyLogger.consoleLogger.info("String " + str + " converted to int :" + num2);
		
		String str1 = String.valueOf(num1); //converts String to String
		MyLogger.consoleLogger.info("Integer " + num1 + " converted to String :"+str1);
		
		
		String str2 = String.valueOf(num2); //converts String to String
		MyLogger.consoleLogger.info("int " + num2 + " converted to String :"+str2);
		
	}

}
