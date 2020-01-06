package com.nisum.corejava.inheritance.examples;

public class ExampleInherit {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setRollno(100);
		s1.setName("Riyaz");
		s1.setAge(24);
		System.out.println("Roll.no: " + s1.getRollno());
		System.out.println("Name: " + s1.getName());
		System.out.println("Age: " + s1.getAge());
	}
}
