
package com.corejava.java8.streams;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.corejava.util.MyLogger;

class Student1 {
	String name;
	int marks;

	public Student1(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

public class LinkedHashMapUsingStreamsDemo {
	public static void main(String[] args) {

		Map<String, Integer> studentList = new LinkedHashMap<String, Integer>();
		studentList.put("Riyaz", 100);
		studentList.put("Syed", 108);
		studentList.put("Avinash", 103);
		studentList.put("Rohit", 107);
		studentList.put("Junaid", 100);

		// iterating a LinkedhashMap
		studentList.entrySet().forEach(
				e -> MyLogger.consoleLogger.info("Student name: " + e.getKey() + ", Student marks: " + e.getValue()));

		//Note: working on the below logic
		// adding 10 grace marks to everyone
//		Map<String, Integer> listWithGraceMarks = studentList.entrySet().stream()
//				.map(student -> student.getValue() + 10).collect(Collectors.toMap(e->e.getKey(),
//                        e->e.getValue());

	}

}
