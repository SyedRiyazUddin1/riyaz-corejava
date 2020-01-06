package com.nisum.corejava.java8.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda {

	public static void main(String... a) {
		List<Employee> empList = Arrays.asList(new Employee(18, "Ashok", 15000), new Employee(22, "Ashok", 18000),
				new Employee(22, "Ashok", 19000), new Employee(18, "Ram", 19000));
		MyComparator<Employee> comAge = (e1, e2) -> e1.getAge() - e2.getAge();

		Comparator<Employee> cmpName = MyComparator.comparing(Employee::getName);
		Comparator<Employee> cmpSalary = MyComparator.comparing(Employee::getSalary);
		Comparator<Employee> cmpEmp = cmpName.thenComparing(comAge).thenComparing(cmpSalary);
		Collections.sort(empList, cmpEmp);
		empList.forEach((e) -> System.out.println(e.toString()));

	}

}
