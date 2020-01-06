package com.nisum.corejava.collectionsframework;

import java.util.*;

public class ExampleCollection {
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList(); //creating an object of ArrayList
		
		//Collection method
		l1.add("Riyaz");
		l1.add("Syed");
		l1.add(120);
		
		//List method
		l1.add(0, "Raj");
		
		Iterator it = l1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(l1);
		
		
	}

}
