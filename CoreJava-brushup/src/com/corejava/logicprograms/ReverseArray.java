package com.corejava.logicprograms;

//Program to reverse an array.
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.corejava.util.MyLogger;

public class ReverseArray {

	public static void main(String args[]) {

		String[] menu = { "Chicken Biryani", "Haleem", "Mutton Kebab" };

		MyLogger.consoleLogger.info("array before reversing: " + Arrays.toString(menu));

		List<String> listOfProducts = Arrays.asList(menu);

		Collections.reverse(listOfProducts);

		String[] reversed = listOfProducts.toArray(menu);

		MyLogger.consoleLogger.info("array after reversing: " + Arrays.toString(reversed));
	}
}
