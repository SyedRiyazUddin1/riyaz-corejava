package com.corejava.logicprograms;

import com.corejava.util.MyLogger;

public class EvenElementsFromArrayDemo {

	public static void main(String[] args) {

		int myArr1[] = { 1, 3, 4, 5, 6, 9, 13, 14, 17, 19, 22 };

		MyLogger.consoleLogger.info("Even Numbers: ");

		// logic to print even numbers from an array
		for (int loop1 = 0; loop1 < myArr1.length; loop1++) {
			if (myArr1[loop1] % 2 == 0) {
				MyLogger.consoleLogger.info(myArr1[loop1]);
			}
		} // end of logic here

		MyLogger.consoleLogger.info("Odd Numbers: ");

		// logic to print odd numbers from an array
		for (int loop = 0; loop < myArr1.length; loop++) {
			if (myArr1[loop] % 2 != 0) {
				MyLogger.consoleLogger.info(myArr1[loop]);
			}
		} // end of logic here
	}
}
