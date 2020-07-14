package com.corejava.controlstructures;

import com.corejava.util.MyLogger;

public class SwitchExample {

	public static void main(String[] args) {
		
		int number = 1;
		
		switch (number) {
		
		case 0:
			MyLogger.consoleLogger.info("number is equal to o");
			break;
		case 1:
			MyLogger.consoleLogger.info("number is equal to 1");
			break;
		default:
			MyLogger.consoleLogger.info("number is either negative, or higher than 1");
			break;
		}
	}
}
