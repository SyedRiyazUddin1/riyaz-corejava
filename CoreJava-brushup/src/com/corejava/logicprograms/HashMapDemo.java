package com.corejava.logicprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.corejava.util.MyLogger;

public class HashMapDemo {

	public static void main(String args[]) {

		// Declaring a HashMap of Integer keys and String values
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(1, "Riyaz");
		hashmap.put(2, "Syed");
		hashmap.put(3, "Avinash");
		hashmap.put(4, "Rohit");
		hashmap.put(5, "Kumar");

		System.out.println("HashMap contains: " + hashmap);

		/* Geting values based on key */
		String var = hashmap.get(2);
		MyLogger.consoleLogger.info("Value at key 2 is: " + var);

		/* Remove values based on key */
		hashmap.remove(3);
		MyLogger.consoleLogger.info("Map after removal :" + hashmap);

		/*
		 * Converting Map to Set in Java 7
		 */
		Set<Entry<Integer, String>> set = hashmap.entrySet();
		Iterator<Entry<Integer, String>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			MyLogger.consoleLogger.info("Key is: " + pair.getKey() + " and Value is: ");
			MyLogger.consoleLogger.info(pair.getValue());
		}
		
		MyLogger.consoleLogger.info(set);
	
	}

}
