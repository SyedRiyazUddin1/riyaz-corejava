package com.javapractice.corejava.collectionsframework;

//Import the HashMap class
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		// Creating a HashMap object called capitalCities
		HashMap<String, String> capitalCities = new HashMap<String, String>();

		// Adding keys and values (Country, City)
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("India", "Delhi");	
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);
		
		boolean replace = capitalCities.replace("USA", "Delhi", "California");	
		System.out.println(replace);
		
		//printing the number of key-value mappings
		int size = capitalCities.size();
		System.out.println(size);
		
		System.out.println(capitalCities);
	}
}