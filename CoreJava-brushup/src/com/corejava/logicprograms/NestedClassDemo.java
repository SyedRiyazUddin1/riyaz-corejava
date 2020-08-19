package com.corejava.logicprograms;

import com.corejava.util.MyLogger;

//Program to create 

public class NestedClassDemo {

	// initializing variable in main class
	int num1 = 2;

    //nested class
	class Student {

		//// initializing variable in nested class
		int num = 1;

	}

	public static void main(String[] args) {
		
		//way to create an object of nested class

		NestedClassDemo.Student s1 = new NestedClassDemo().new Student();


		//assigning a different value to num variable
		s1.num = 10;
		MyLogger.consoleLogger.info(s1.num);

		NestedClassDemo nestedClass = new NestedClassDemo();
		//assigning a different value to num variable
		nestedClass.num1 = 3;
		MyLogger.consoleLogger.info(nestedClass.num1);
	}
}
