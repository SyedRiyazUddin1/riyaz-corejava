package com.corejava.logicprograms;
//program to find the largest number in an array.

import java.util.Arrays;

import com.corejava.util.MyLogger;

public class MaxValueInArray {

	public static void main(String[] args) {

		int arr[] = { 100, 324, 450, 900, 980 };

		int max = Arrays.stream(arr).max().getAsInt();

		MyLogger.consoleLogger.info("Largest in given array is " + max);
	}

}