package com.javapractice.corejava.java8.examples;

import java.util.Arrays;
import java.util.List;

public class Excercise1 {
	public static void main(String []args) {
		List<Person> people = Arrays.asList(
	//calling Person object Constructor with bunch of person objects
			new Person("Riyaz", "Uddin", 60),
			new Person("Shekhar", "Chandra", 42),
			new Person("Rohit", "Chaudhary", 51),
			new Person("David", "Warner", 40),
			new Person("Virat", "Kohli", 35)
			);
		
	//Step1: Sort list by Last Name
	//Step2: Create a method that prints all the elements in the list
	//Step3: Create a method that prints all people that have last name beginning with C

	}
}
