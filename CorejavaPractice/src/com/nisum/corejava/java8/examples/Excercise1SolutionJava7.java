package com.nisum.corejava.java8.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Excercise1SolutionJava7 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				// calling Person object Constructor with bunch of person objects
				new Person("Riyaz", "Uddin", 60), new Person("Shekhar", "Chandra", 42),
				new Person("Rohit", "Chaudhary", 51), new Person("David", "Warner", 40),
				new Person("Virat", "Kohli", 35));

		// Step1: Sort list by Last Name
		
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {

				return o1.getLastName().compareTo(o2.getFirstName());
			}
		});

		// Step2: Create a method that prints all the elements in the list
		printAll(people);
		

	
		
		// Step3: Create a method that prints all people that have last name beginning
				// with C
		printLastNameBeginningWithC(people);
	}
	
	private static void printLastNameBeginningWithC (List<Person> people) {
		for (Person p: people) {
			if(p.getLastName().startsWith("C")) {
				System.out.println(p);
			}
		}
	}
	
	private static void printAll(List<Person> people) {
		for (Person p: people) {
			System.out.println(p);
		}
	}
}
