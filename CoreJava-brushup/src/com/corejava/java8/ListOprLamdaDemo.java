package com.corejava.java8;

//sorting the Employee object's list and printing in ascending order based on the employee id

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.corejava.util.MyLogger;

class Employee {

	String name;
	int eno;
	double salary;

	Employee(String name, int eno, double salary) {
		this.name = name;
		this.eno = eno;
		this.salary = salary;

	}

	public String toString() {
		return name + ":" + eno + ":" + salary;
	}
}

public class ListOprLamdaDemo {

	public static void main(String[] args) {

		List<Employee> myList = new ArrayList<Employee>();

		myList.add(new Employee("Riyaz", 101, 33001));
		myList.add(new Employee("Avinash", 205, 47003));
		myList.add(new Employee("Farhan", 209, 302051));
		myList.add(new Employee("Rohit", 355, 25051));
		myList.add(new Employee("Zeeshan", 880, 40050));

		MyLogger.consoleLogger.info("List of employees :" + myList);

		// sorting list using Comparator and lambda expression
		/**
		 * Get the highest salaried employee details, after sorting it in ascending
		 * order, get the first element from the list with the method list.get(index);
		 */
		Collections.sort(myList, (e1, e2) -> (e1.salary < e2.salary) ? 1 : (e1.salary > e2.salary) ? -1 : 0);
		MyLogger.consoleLogger.info("Sorted list based on salary (numeric) order (Ascending) " + myList);
		MyLogger.consoleLogger.info("Highest salaried employee: " + myList.get(0));
		
		
		/**
		 * Get the lowest salaried employee details, after sorting it in descending
		 * order, get the last element from the list with the method list.get(-1);
		 */
		Collections.sort(myList, (e1, e2) -> (e1.salary < e2.salary) ? -1 : (e1.salary > e2.salary) ? 1 : 0);
		MyLogger.consoleLogger.info("Sorted list based on salary (numeric) order (Descending)" + myList);
		MyLogger.consoleLogger.info("Low salaried employee: " + myList.get(0));
		

		// sorting based on alphabetical order of emp names (ASCENDING)
		Collections.sort(myList, (e1, e2) -> (e1.name.compareTo(e2.name)));

		MyLogger.consoleLogger.info("Sorted list based on alphabetical (ASCENDING) order " + myList);

		// sorting based on alphabetical order of emp names (DESCENDING)
		Collections.sort(myList, (e1, e2) -> (e2.name.compareTo(e1.name)));
		MyLogger.consoleLogger.info("Sorted list based on alphabetical (DESCENDING) order " + myList);
		
		
		//adding tax to the salaries
		//List<Employee> newList = myList.stream().map((e1)->e1.salary*)

	}
	
}
