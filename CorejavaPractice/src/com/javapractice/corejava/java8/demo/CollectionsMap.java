package com.javapractice.corejava.java8.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsMap {

	public static void main(String... strings) {
		Employee emp1 = new Employee(21, "Ashok", 10000);
		Employee emp2 = new Employee(21, "Ram", 15000);
		Employee emp3 = new Employee(21, "Shyam", 12000);
		Employee emp4 = new Employee(21, "Anil", 8000);
		Employee emp5 = new Employee(21, "Brian", 12000);
		Employee emp6 = new Employee(21, "Ashley", 12000);

		Department engg = new Department("Engineering");
		Department itsupport = new Department("IT Support");
		Department helpDesk = new Department("HelpDesk");

		Map<Department, List<Employee>> map = new HashMap<>();

		map.computeIfAbsent(engg, dept -> new ArrayList<>()).add(emp1);
		map.computeIfAbsent(itsupport, dept -> new ArrayList<>()).add(emp2);
		map.computeIfAbsent(itsupport, dept -> new ArrayList<>()).add(emp3);

		Map<Department, List<Employee>> map2 = new HashMap<>();

		map2.computeIfAbsent(engg, dept -> new ArrayList<>()).add(emp4);
		map2.computeIfAbsent(itsupport, dept -> new ArrayList<>()).add(emp5);
		map2.computeIfAbsent(helpDesk, dept -> new ArrayList<>()).add(emp6);

		map2.forEach((dept, emp) -> {
			map.merge(dept, emp, (empFromMap1, empFromMap2) -> {
				empFromMap1.addAll(empFromMap2);
				return empFromMap1;
			});
		});

		map.forEach((dept, emp) -> System.out.println(dept + "" + emp));

	}

}
