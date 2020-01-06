package com.nisum.corejava.collectionsframework;

import java.util.*;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++)
			al.add(i);
		System.out.println(al);
		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
		Integer I=(Integer)it.next();
			if (I > 3 && I < 8)
				it.remove();
		}
		System.out.println(al);
	}
}
