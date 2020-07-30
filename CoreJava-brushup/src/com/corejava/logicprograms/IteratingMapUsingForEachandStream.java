package com.corejava.logicprograms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.corejava.util.MyLogger;

public class IteratingMapUsingForEachandStream {

	public static void main(String[] args) {

		Map<Integer, String> employees = new HashMap<Integer, String>();

		employees.put(109, "Riyaz");
		employees.put(103, "ayaz");
		employees.put(105, "Syed");
		employees.put(102, "Avinash");
		employees.put(113, "Rohit");
		employees.put(101, "Junaid");

		MyLogger.consoleLogger.info(employees);

		//converting map to List (only values)
		List<String> str = employees.values().stream()
//				.filter(p -> p.toUpperCase().startsWith("A"))
				.map(p->p.concat(" Engineer"))
				.collect(Collectors.toList());
		MyLogger.consoleLogger.info(str);

		
		//converting map to List (only keys)
				List<Integer> str1 = employees.keySet().stream().filter(p->p>=105)
//						.sorted((num1,num2)->(num1<num2)?1:num1>num2?-1:0)
						.sorted((num1,num2)->-num1.compareTo(num2))
						.collect(Collectors.toList());
		MyLogger.consoleLogger.info(str1);

		// iterating the map
		employees.forEach((key, value) -> {
			MyLogger.consoleLogger.info("Emp.Id: " + key + "," + "Employee Name: " + value);
		});
	}

}
