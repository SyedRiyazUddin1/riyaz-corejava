package com.corejava.java8.Function;

import java.util.function.Consumer;

//Display student result with grades based on their marks using Predicate and Function interfaces

import java.util.function.Function;
import java.util.function.Predicate;

import com.corejava.util.MyLogger;

class Student {
	String name;
	int marks;

	Student(String name, int marks) {

		this.name = name;
		this.marks = marks;
	}
}

public class MarksGradeCheckDemo {

	public static void main(String[] args) {

		Function<Student, String> func = s -> {

			int marks = s.marks;
			String grade = "";
			if (marks >= 80)
				grade = "A (Distinction)";
			else if (marks >= 60)
				grade = "B (First Class)";
			else if (marks >= 60)
				grade = "B (First Class)";
			else if (marks >= 50)
				grade = "C (Second Class)";
			else if (marks >= 35)
				grade = "D (Third Class)";
			else
				grade = "E (Fail)";
			return grade;
		};

		Student[] student = { new Student("Riyaz", 100), new Student("Syed", 65), new Student("Rohit", 55),
				new Student("Avinash", 45), new Student("Azeem", 25) };

		for (Student s : student) {
			MyLogger.consoleLogger.info("Student name: " + s.name);
			MyLogger.consoleLogger.info("Student marks: " + s.marks);
			MyLogger.consoleLogger.info("Student grade: " + func.apply(s));
			MyLogger.consoleLogger.info("*********************************");

		}

		// students who scored >=60 marks
		MyLogger.consoleLogger.info("Students who scored >=60 marks");

		Predicate<Student> pr = stu -> stu.marks >= 60;

		// can replace the below code with consumer interface too
		for (Student stu : student) {
			if (pr.test(stu) == true) {
				MyLogger.consoleLogger.info("Student name: " + stu.name);
				MyLogger.consoleLogger.info("Student marks: " + stu.marks);
				MyLogger.consoleLogger.info("Student grade: " + func.apply(stu));
			}
		}

		MyLogger.consoleLogger.info("****Printing the details using Consumer interface***");
		// using consumer interface to print the student details
		Consumer<Student> con = stu -> {
			MyLogger.consoleLogger.info("Student name: " + stu.name);
			MyLogger.consoleLogger.info("Student marks: " + stu.marks);
			MyLogger.consoleLogger.info("Student grade: " + func.apply(stu));

		};
		for (Student stu1 : student) {
			if(pr.test(stu1)) {
			con.accept(stu1);
			}
		}
	}
}
