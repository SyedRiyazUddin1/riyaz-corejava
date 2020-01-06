package com.nisum.corejava.collectionsframework;

import java.util.Scanner;

public class MyInterface {
	public static void main(String[] args) {
		
		int a, b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("Enter the second value");
		b = sc.nextInt();
		c=a/b;
		System.out.println("Division of a and b is:" +c);
	
		


	}
}
