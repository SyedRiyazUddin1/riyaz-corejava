package com.nisum.corejava.collectionsframework;
import java.util.*;
import java.util.function.Predicate;

public class ListIteratorDemo {
public static void main (String args[]) {
	LinkedList l = new LinkedList();
	l.add("c");
	l.add("c++");
	l.add("Java");
	l.add("Python");
	System.out.println(l);
	
	ListIterator lit=l.listIterator();
	while(lit.hasNext()) {
		String s=(String)lit.next();
		if (s.contentEquals("Java"))
			lit.set("Java 8");
		else if(s.equals("c"))
          lit.add("Data Structure");
          else if(s.contentEquals("Python"))
        	  lit.remove();
	}
	System.out.println(l);
}
}

//output: 
//[c, c++, Java, Python]
//[c, Data Structure, c++, Java 8]
