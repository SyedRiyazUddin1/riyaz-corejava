package com.corejava.java8.Predicate;

//print employees with salary less than 5k

import java.util.ArrayList;
import java.util.function.Predicate;

import com.corejava.util.MyLogger;

class Employee {
	String ename;
	double salary;

	Employee(String ename, double salary) {

		this.ename = ename;
		this.salary = salary;
	}
}

public class SalaryCheckDemo {
	public static void main(String[] args) {

		ArrayList<Employee> myList = new ArrayList<Employee>();
		myList.add(new Employee("Riyaz", 10000));
		myList.add(new Employee("Syed", 5000));
		myList.add(new Employee("Avinash", 4000));
		myList.add(new Employee("Rohit", 3500));
		myList.add(new Employee("Raj", 2500));

		Predicate<Employee> p = e -> e.salary < 5000 && e.salary > 2500;
		for (Employee emp : myList) {
			if (p.test(emp)) {
				MyLogger.consoleLogger.info(emp.ename + ":" + emp.salary);

			}
		}
	}
}
