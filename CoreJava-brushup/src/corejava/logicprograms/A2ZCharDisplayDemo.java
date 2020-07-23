package com.corejava.logicprograms;

import com.corejava.util.MyLogger;

//Printing A to Z characters

public class A2ZCharDisplayDemo {

	public static void main(String[] args) {

		char charac = 'A';

		while (charac <= 'Z') {
			MyLogger.consoleLogger.info(charac);
			charac++;
		}
	}

}
