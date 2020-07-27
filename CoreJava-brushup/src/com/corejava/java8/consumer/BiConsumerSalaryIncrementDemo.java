package com.corejava.java8.consumer;

/**Increment in the salary using BiConsumer Interface*/

import java.util.ArrayList;
import java.util.function.BiConsumer;

import com.corejava.util.MyLogger;

class Employee {

	String name;
	double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

}

public class BiConsumerSalaryIncrementDemo {

	public static void main(String[] args) {

		ArrayList<Employee> myList = new ArrayList<Employee>();
		populate(myList);
		BiConsumer<Employee, Double> biCon = (emp, d) -> emp.salary = emp.salary + d;

		for (Employee employee : myList) {
			biCon.accept(employee,500.0);
		}

		for (Employee emp : myList) {
			MyLogger.consoleLogger.info("Employee name: " + emp.name);
			MyLogger.consoleLogger.info("Employee name: " + emp.salary);
			MyLogger.consoleLogger.info("**************************");

		}
	}

	private static void populate(ArrayList<Employee> myList) {
		myList.add(new Employee("Riyaz", 2000));
		myList.add(new Employee("Syed", 3000));
		myList.add(new Employee("Avinash", 4000));
		myList.add(new Employee("Rohit", 5000));

	}

}
