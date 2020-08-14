package com.corejava.logicprograms;

/*
 * Program for extracting word from a sentence
 */
public class ExtractWordFromSentenceDemo {
	
	public static void main(String args[]) {
		
		String str = "My Name Is Preeti Jain";
		
		//saving a string in string array
		String[] words = str.split(" ", 5);

		//iterating the array
		for (String word : words)
			System.out.println(word);
	}
}
