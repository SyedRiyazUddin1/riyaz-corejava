package com.corejava.java8.Function;

import java.util.ArrayList;
import java.util.function.BiFunction;

import com.corejava.util.MyLogger;

class Employee{
	
	int eno;
	String name;
	Employee(int eno, String name){
		this.eno = eno;
		this.name=name;
	}
	
}

public class BiFunctionDemo1 {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> myList = new ArrayList<Employee>();
		
		BiFunction<Integer,String,Employee> biFunction =  (eno, name)->new Employee(eno, name);
		
		myList.add(biFunction.apply(100, "Riyaz"));
		myList.add(biFunction.apply(108, "Syed"));
		myList.add(biFunction.apply(200, "Rohit"));
		myList.add(biFunction.apply(300, "Avinash"));
		
		
		for(Employee emp:myList) {
		MyLogger.consoleLogger.info("Employee No: "+emp.eno);
		MyLogger.consoleLogger.info("Employee Name: "+emp.name);
		MyLogger.consoleLogger.info("********************");
		
		}
		
	}

}
