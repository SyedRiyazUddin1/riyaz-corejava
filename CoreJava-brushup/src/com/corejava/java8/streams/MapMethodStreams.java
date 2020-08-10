package com.corejava.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.corejava.util.MyLogger;

class Student {
	String name;
	int rollno;
	int marks;

	public Student(String name, int rollno, int marks) {
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}
}

public class MapMethodStreams {
	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Riyaz",100,80));
		studentList.add(new Student("Syed",108,60));
		studentList.add(new Student("Avinash",103,50));
		studentList.add(new Student("Rohit",107,40));
		studentList.add(new Student("Junaid",100,62));
		
		for(Student s1: studentList) {
		MyLogger.consoleLogger.info("Students Info: Name: "+s1.name +", Marks: "+s1.rollno+", Roll.No: "+s1.marks );
		}
		
		//adding 10 grace marks to everyone
		List<Integer> graceMarks = studentList.stream().map(student->student.marks+10).collect(Collectors.toList());
		 
		
		for(Student s1: studentList) {
			MyLogger.consoleLogger.info("Students Info: Name: "+s1.name +", Marks: "+s1.rollno+", Roll.No: "+s1.marks );
			}
	}

}
