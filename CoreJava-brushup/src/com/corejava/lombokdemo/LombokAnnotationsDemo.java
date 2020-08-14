package com.corejava.lombokdemo;

import java.util.ArrayList;
import java.util.List;

import com.corejava.util.MyLogger;

import lombok.AllArgsConstructor;

/*
 * @Data annotation helps us by providing the setter, getter, constructor,
 * overiding toString(),hashcode() and equals() methods
 */

@AllArgsConstructor
class Employee {

	/*
	 * If you think that @Data annotation is providing too much, we can also have
	 * the control on it by writing the below @Setter and @Getter annotations above
	 * each field
	 */

    //	@Getter @Setter
	private String name;
	//	@Getter @Setter
	private double salary;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}

public class LombokAnnotationsDemo {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Riyaz", 50000));
		empList.add(new Employee("Avinash", 60000));
		empList.add(new Employee("Rohit", 40000));
		empList.add(new Employee("Azeem", 38000));

		MyLogger.consoleLogger.info(empList);

	}
}
