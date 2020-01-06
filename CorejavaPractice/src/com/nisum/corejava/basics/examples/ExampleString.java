package com.nisum.corejava.basics.examples;

public class ExampleString {
public static void main (String[] args) {
	String s1 = "Syed Riyaz Uddin";
	String s2 = "ES Department";
	String s3 = s2.substring(6,11);
	String s4 = "Building Java Programs";
	String s5 = "Computer";
	String s6 = "computer";

	/* trying various String methods */
	System.out.println(s1.length());
	System.out.println(s1.indexOf("y"));
	System.out.println(s1.substring(4,8));
	System.out.println(s3.toLowerCase());
	System.out.println(s3.toUpperCase());
	System.out.println(s1.indexOf("Riyaz"));
	System.out.println(s5==s6); //comparing references//
	System.out.println(s5.equals(s6)); //comparing strings//
	System.out.println(s5.compareTo(s6));
	
// method to extract java from s4
	System.out.println (s4.substring(9,13));
}
}
