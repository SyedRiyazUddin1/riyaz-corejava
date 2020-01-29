package com.javapractice.corejava.java8.stream.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamFromFileDemo {

	public static void main(String args[]) {

		String fileName = "D:\\Java Programs\\StreamFromFileDemo.txt";

		// read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			stream.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
