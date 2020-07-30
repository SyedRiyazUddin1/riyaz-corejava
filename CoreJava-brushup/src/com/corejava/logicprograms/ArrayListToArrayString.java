package com.corejava.logicprograms;

import java.util.ArrayList;

import com.corejava.util.MyLogger;

public class ArrayListToArrayString {

		public static void main(String args[]) {

			ArrayList<String> arrlist = new ArrayList<String>();
			arrlist.add("Java");
			arrlist.add("JavaScript");
			arrlist.add("Python");
			arrlist.add("Data Science");

			// Converting an arrayList to an array.
			String array[] = new String[arrlist.size()];
			for (int loop = 0; loop < arrlist.size(); loop++) {
				array[loop] = arrlist.get(loop);
			}

			/* Displaying Array elements. */
			for (String str : array) {
				MyLogger.consoleLogger.info(str);
			}
		}
	}

