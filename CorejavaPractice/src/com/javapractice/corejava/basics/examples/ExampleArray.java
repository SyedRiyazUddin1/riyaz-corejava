package com.javapractice.corejava.basics.examples;

import java.util.*;

public class ExampleArray {
	public void main(String[] args) {
		
		
		
		int myArray [] [] = {{1,2,3,4},{1,2}}; 
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter"
				+ "r 5 number");
		for (int i = 0; i < 5; i++)
			arr[i] = sc.nextInt();

		for (int i = 0; i < 5; i++)
			System.out.println("arr[" + i + "]=" + arr[i]);
	}
}