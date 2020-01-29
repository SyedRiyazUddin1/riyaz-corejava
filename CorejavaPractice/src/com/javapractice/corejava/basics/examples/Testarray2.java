package com.javapractice.corejava.basics.examples;

//Java Program to demonstrate the way of passing an array  
//to method.  
class Testarray2 {
//creating a method which receives an array as a parameter  
	static void min(int arr[]) {
		int min = arr[0];
		for (int loop = 1; loop < arr.length; loop++)
			if (min > arr[loop])
				min = arr[loop];

		System.out.println(min);
	}

	public static void main(String args[]) {
		int a[] = { 33, 3, 4, 5 };// declaring and initializing an array
		min(a);// passing array to method

	}
}