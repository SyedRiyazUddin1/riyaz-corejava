package com.corejava.collectionframework;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Employee> setEmp = new HashSet<Employee>();

		setEmp.add(new Employee(1, "Raj"));
		setEmp.add(new Employee(2, "Riyaz"));
		setEmp.add(new Employee(3, "Rohit"));
		setEmp.add(new Employee(1, "Raj"));

		
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		set.add(2);

//		System.out.println(set.size());
//		System.out.println(setEmp.size());

		System.out.println(setEmp);
		System.out.println(set);

	}
}
