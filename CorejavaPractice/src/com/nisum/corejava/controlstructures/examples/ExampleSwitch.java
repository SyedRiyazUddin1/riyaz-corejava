package com.nisum.corejava.controlstructures.examples;

public class ExampleSwitch {
public static void main (String[] args) {
	int number = 1;
			switch (number) {
			case 0:
			 System.out.println ("number is equal to o");
			 break;
			case 1:
			 System.out.println ("number is equal to 1");
			 break;
			default:
			System.out.println("number is either negative, or higher than 1");
			 break;
			}
}
}
