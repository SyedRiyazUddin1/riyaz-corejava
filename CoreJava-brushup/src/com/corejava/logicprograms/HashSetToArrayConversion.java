package com.corejava.logicprograms;

//class to convert HashSet to an Array

import java.util.HashSet;

public class HashSetToArrayConversion {
	public static void main(String args[]) {

		// Declaring a HashSet
		HashSet<String> hashset = new HashSet<String>();
		
		// Adding elements to HashSet
		hashset.add("Pear");
		hashset.add("Apple");
		hashset.add("Orange");
		hashset.add("Papaya");
		hashset.add("Banana");
		
		System.out.println("HashSet contains :" + hashset);
		
		// Creating an Array of HashSet size
		String[] array = new String[hashset.size()];
		
		// Converting HashSet to Array using toArray() method
		hashset.toArray(array);
		
		// Iterating array elements
		System.out.println("Array contains :");
		for (String str : array) {
			System.out.println(str);
		}
	}
}
