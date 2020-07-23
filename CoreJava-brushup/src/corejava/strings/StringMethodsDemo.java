package com.corejava.strings;

public class StringMethodsDemo {

	public static void main(String[] args) {

		String s1 = "Syed Riyaz Uddin";
		String s2 = "BE Department";
		String s3 = s2.substring(6, 11);
		String s4 = "Building Java Programs";
		String s5 = "Computer";
		String s6 = "computer";
		String s7 = "This is demo";

		// trying various String methods//
		System.out.println(s1.length()); // returns the length of s1
		System.out.println(s1.indexOf("y")); // returns the index of "y"
		System.out.println(s1.substring(5, 8)); // returns substring from index 5 to index 8

		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());
		System.out.println(s1.indexOf("Riyaz"));
		System.out.println(s5 == s6); // comparing references//
		System.out.println(s5.equals(s6)); // comparing strings//
		System.out.println(s5.compareTo(s6)); // compares the strings lexicographically
		System.out.println(s5.compareToIgnoreCase(s6)); // compares the strings lexicographically ignoring cases

		System.out.println(s1.charAt(9)); // returns character at index number

		// method to extract java from s4
		System.out.println(s4.substring(9, 13));

		System.out.println(s7.replace("is", "was"));// output: Thwas was demo
		System.out.println(s7.replaceFirst("is", "was")); // OP: Thwas is demo
		System.out.println(s7.replaceAll("is", "was")); //OP: Thwas was demo
		System.out.println(s7.replaceAll("is(.)", "was")); //OP: Thwaswasdemo
		

	}
}
