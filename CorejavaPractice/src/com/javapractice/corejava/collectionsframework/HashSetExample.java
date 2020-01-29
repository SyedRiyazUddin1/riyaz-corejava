package com.javapractice.corejava.collectionsframework;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("One");
		hs.add("Two");
		hs.add("Three");
		hs.add("Four");
		hs.add("One"); //duplicates are not allowed
		System.out.println(hs);
		//output shows that there is no insertion order preserved
		
		Iterator<String> it= hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Using forEach:");
		for(String object: hs) {
			System.out.println(object);
		}
	}
}
