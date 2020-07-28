package com.corejava.logicprograms;

import java.util.ArrayList;

import com.corejava.util.MyLogger;

public class ArrayListToArrayInt {

	public static void main(String args[]) {

		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(101);
		arrlist.add(103);
		arrlist.add(104);
		arrlist.add(110);

		// Converting an arrayList to an array
		int array[] = new int[arrlist.size()];
		for (int loop = 0; loop < arrlist.size(); loop++) {
			array[loop] = arrlist.get(loop);
		}

		/* Displaying Array elements */
		for (Integer str : array) {
			MyLogger.consoleLogger.info(str);
		}
	}
}
