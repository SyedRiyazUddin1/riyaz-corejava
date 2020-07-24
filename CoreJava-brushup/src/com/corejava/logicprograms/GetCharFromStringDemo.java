package com.corejava.logicprograms; 

import com.corejava.util.MyLogger;

public class GetCharFromStringDemo {
	
	public static void main(String[] args) {
		
		String myName = "Syed Riyaz Uddin";
		
		MyLogger.consoleLogger.info(myName.charAt(5));
		
		//Concatenating Strings
		String designation = "Software Engineer";
		
		String newString = myName.concat(" "+designation);
		
		MyLogger.consoleLogger.info(newString);
		
	}

}
