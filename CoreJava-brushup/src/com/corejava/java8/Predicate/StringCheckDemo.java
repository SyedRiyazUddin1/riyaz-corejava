package com.corejava.java8.Predicate;

import java.util.function.Predicate;

import com.corejava.util.MyLogger;

public class StringCheckDemo {

	public static void main(String[] args) {

		String[] myArray = { "Syed", "Riyaz", "JunaidUddin", "MdFarhan", };

		Predicate<String> p = str -> str.length() > 5;

		for (String s1 : myArray) {

			if (p.test(s1)) {
				MyLogger.consoleLogger.info(s1);

			}

		}
	}

}
