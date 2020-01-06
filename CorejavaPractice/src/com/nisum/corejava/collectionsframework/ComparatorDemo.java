package com.nisum.corejava.collectionsframework;

import java.util.*;

class Book {
	private String title;
	private double price;
//constructor of Book class below
	public Book(String title, double price) {
		this.title = title; //local variable values will be assign in instance members
		this.price = price;
	}
//functions
	public String getTitle() {
		return (title);
	}

	public double getPrice() {
		return (price);
	}
}

//class for Comparator implementation//
class MyComparator implements Comparator {
	public int compare(Object o1, Object o2) //o2 = already inserted,o1 = inserting.
	{
Book book1=(Book)o1;
Book book2=(Book)o2;
if (book1.getPrice() < book2.getPrice())
return(-1);
else
	return(1);
	} 

}

//main class
public class ComparatorDemo {
	public static void main(String[] args) {
//creating Book class objects in main class
		Book b1, b2, b3; //reference variables
		b1 = new Book("PHP", 300.00);
		b2 = new Book("Java", 500.00);
		b3 = new Book("C++", 400.00);
//creating TreeSet object and passing Comparator's object in the constructor in order to do custom sorting
		TreeSet t = new TreeSet(new MyComparator());
		t.add(b1);
		t.add(b2);
		t.add(b3);
		
		Book b;
		Iterator it= t.iterator();
		while(it.hasNext())
		{
			b=(Book)it.next();
		System.out.println(b.getTitle()+ " " + b.getPrice());
		}
	}
}
