package com.corejava.logicprograms;


//sorting the Employee object's list and printing in ascending order based on the employee id..

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.corejava.util.MyLogger;

class Employee {

	String name;
	int eno;

	Employee(String name, int eno) {
		this.name = name;
		this.eno = eno;
	}

	public String toString() {
		return name + ":" + eno;

	}
}

public class SortingEmployeeObjectListAscendingDemo {

	public static void main(String[] args) {

		List<Employee> myList = new ArrayList<Employee>();

		myList.add(new Employee("Riyaz", 3001));
		myList.add(new Employee("Syed", 5003));
		myList.add(new Employee("Farhan", 2051));

		MyLogger.consoleLogger.info(myList);

		// sorting list using Comparator and lambda expression
		Collections.sort(myList, (e1, e2) -> (e1.eno < e2.eno) ? -1 : (e1.eno > e2.eno) ? 1 : 0);

		MyLogger.consoleLogger.info("Sorted list " + myList);

	}

}
