package com.javapractice.corejava.java8.stream.examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2SetConversion {
	public static void main(String[] args) {

		String []myArray = {"Riyaz", "Avinash","Rohit","Riz"};
		Set<String> EmpNames = new HashSet<>(Arrays.asList(myArray));

		Stream<String> streamOfEmpNames = EmpNames.stream(); //created a stream of Employee Names
		
		//Now, lets perform some operation on these stream and convert it back to Set
		
		Set<String> NewEmpList = streamOfEmpNames
				.filter(name -> name.startsWith("R")) //returns [Rohit, Riz, RIYAZ]
				.filter(name -> name.endsWith("z")) //returns [Riz]
				.collect(Collectors.toSet()); // collecting the filtered streams and converting it into HashSet
		
		System.out.println(NewEmpList);
		
	}
}
