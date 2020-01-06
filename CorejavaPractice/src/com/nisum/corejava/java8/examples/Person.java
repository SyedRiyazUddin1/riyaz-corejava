package com.nisum.corejava.java8.examples;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	//Constructor
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	//getters and setters
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}

//toString method to print the objects of Person class in nice manner
	
	public String toString() {
		return "Person [firstName=" + firstName + ",lastName="+ lastName + ", age="
	 + age + "]";
	}	
}
