package com.nisum.corejava.java8.stream.examples;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2SetConversion {
	public static void main(String[] args) {
		Set<String> EmpNames = new HashSet<String>();
		EmpNames.add("RIYAZ");
		EmpNames.add("Avinash");
		EmpNames.add("Rohit");
		EmpNames.add("Riz");
		
		Stream<String> streamOfEmpNames = EmpNames.stream(); //created a stream of Employee Names
		
		//Now, lets perform some operation on these stream and convert it back to Set
		
		Set<String> NewEmpList = streamOfEmpNames
				.filter(name -> name.startsWith("R")) //returns [Rohit, Riz, RIYAZ]
				.filter(name -> name.endsWith("z")) //returns [Riz]
				.collect(Collectors.toSet()); // collecting the filtered streams and converting it into HashSet
		
		System.out.println(NewEmpList);
		
	}
}
