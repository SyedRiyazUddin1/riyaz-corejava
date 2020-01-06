package com.nisum.corejava.collectionsframework;
// program for generic method//
public class GenericsDemo {
	//generalising the type here by adding <E> before return type
public <E> void printArray(E []s) {
	for(int i=0;i<s.length;i++)
		System.out.println(s[i]);
	
//we can also use the below "for loop" only for array
//for (E x:S)
// System.out.println(x);
	

//By generalising the above method, there is no need to add another function for Integer
		
}
public static void main(String []args) {
	GenericsDemo e1=new GenericsDemo();
	String countries[]= new String[] {"India", "Pakistan","America"};
	Integer numbers[]= {12,34,55,78};
	e1.printArray(countries);
	e1.printArray(numbers);
}
}
 