package com.nisum.corejava.arrays.examples;

class Example1Array {
	public static void main(String[] args) {

		int[] age = new int[5];

		// insert 14 to third element
		age[2] = 14;
		
		// insert 34 to first element
		age[0] = 34;
		
		//insert 26 to fourth element
		age[3]= 26;
		
		//using for loop
		for (int count = 0; count < 5; ++count) {
			
			System.out.println("Element at index " + count + ": " + age[count]);
		}
	}
}