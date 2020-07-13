package com.corejava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {

		List<String> lines = Arrays.asList("springcore", "springmvc", "springboot");

		List<String> result = lines.stream() // convert list to stream
				.filter(line -> !"springboot".equals(line)) // removing springboot
				.collect(Collectors.toList()); // collect the output and convert streams to a List

		result.forEach(System.out::println); // output : springcore, springmvc

	}

}