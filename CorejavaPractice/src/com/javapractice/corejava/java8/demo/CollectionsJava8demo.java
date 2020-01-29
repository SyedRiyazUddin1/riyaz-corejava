package com.javapractice.corejava.java8.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CollectionsJava8demo {

	public static void main(String... a) {
		List<Employee> empList = new ArrayList<Employee>(Arrays.asList(new Employee(18, "Ashok", 15000),
				new Employee(23, "Ashok", 18000), new Employee(35, "Ashok", 19000), new Employee(56, "Ram", 19000)));

		empList.forEach(System.out::println);
		empList.removeIf(e -> e.getAge() < 22);
		empList.replaceAll(e -> new Employee(e.getAge(), e.getName().toUpperCase(), e.getSalary()));
		empList.sort(Comparator.comparing(Employee::getAge).reversed());

		empList.forEach(System.out::println);
	}

}
