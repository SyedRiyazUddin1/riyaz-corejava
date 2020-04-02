package com.springorm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.beans.Employee;
import com.springorm.dao.EmployeeDao;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("empDao");

		/*
		 * / ******************* Insert operation ******************* 
		 * Employee emp = new Employee(); emp.setEno(114); emp.setEname("Syed");
		 * emp.setEsal(5500); emp.setEaddr("Hyderabad");
		 * 
		 * String status = dao.insertEmployee(emp); System.out.println(status);
		 */

		
		/*
		 * / *******************Search operation ******************** 
		 * Employee emp = dao.searchEmployee(111); if (emp != null) {
		 * System.out.println("Employee details");
		 * System.out.println("Employee Number: " + emp.getEno());
		 * System.out.println("Employee Name: " + emp.getEname());
		 * System.out.println("Employee Salary	: " + emp.getEsal());
		 * System.out.println("Employee Address: " + emp.getEaddr()); } else {
		 * System.out.println("Employee Not exist"); }
		 */

		
		/*
		 * / ******************* UPDATE OPERATION ******************* 
		 * Employee emp = new Employee(); emp.setEno(114); emp.setEname("Zeeshan");
		 * emp.setEaddr("Mumbai"); emp.setEsal(8500); String
		 * status=dao.updateEmployee(emp); System.out.println(status);
		 */
		
		String status= dao.deleteEmployee(111);
		System.out.println(status);

	}

}
