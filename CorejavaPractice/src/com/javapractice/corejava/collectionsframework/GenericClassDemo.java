package com.javapractice.corejava.collectionsframework;
//program for generic class//
class MyData<E> { //E is the place holder of data type
	E i; 
	public void add(E i1)
	{ i=i1;}
	public E get()
	{return(i);}
}
public class GenericClassDemo {
	public static void main(String []args) {
		//can write the data type while creating an object of MyData class
		MyData<Integer> m1=new MyData<Integer>();
		MyData<String> m2=new MyData<String>();
		Integer k=new Integer(5);
		m1.add(k);
		m2.add("Rahul");
		System.out.println("m1=" +m1.get() + " m2=" +m2.get());
	}
}