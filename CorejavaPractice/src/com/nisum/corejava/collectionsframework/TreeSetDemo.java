package com.nisum.corejava.collectionsframework;

import java.util.*;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		//t.add(null); //null values are not allowed
		t.add(10);
		t.add(15);
		t.add(10); //No duplicate value insertion 
		System.out.println(t); //default natural sorting
		
	}
}
