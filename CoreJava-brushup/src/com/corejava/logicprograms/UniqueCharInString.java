package com.corejava.logicprograms;

import java.util.HashSet;

public class UniqueCharInString {

	public static void main(String args[]) {

		String inputstring = "Riyazz";

		System.out.println("String: " + inputstring);

		//initializing the variable.
		boolean result = false;
		
		//creating a hashset.
		HashSet<Character> uniquecharset = new HashSet();
		
		//adding all the charac from the string to a hash set
		for (int i = 0; i < inputstring.length(); i++) {
			result = uniquecharset.add(inputstring.charAt(i));
			if (result == false)
				break;
		}
		System.out.println("String contains all unique characters? " + result);
	}
}
