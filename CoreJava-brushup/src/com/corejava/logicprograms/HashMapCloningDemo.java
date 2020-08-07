package com.corejava.logicprograms;

import java.util.HashMap;

public class HashMapCloningDemo {

	public static void main(String args[]) {

		// Creating a HashMap of Integer keys and String values
		
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(1, "Riyaz");
		hashmap.put(2, "Syed");
		hashmap.put(3, "Avinash");
		hashmap.put(4, "Rohit");
		hashmap.put(5, "Junaid");
		System.out.println("HashMap contains: " + hashmap);

		// Creating a new HashMap
		HashMap<Integer, String> hashmap2 = new HashMap<Integer, String>();

		// cloning first HashMap in the second one
		hashmap2 = (HashMap) hashmap.clone();

		System.out.println("Cloned Map contains: " + hashmap2);
	}
}

