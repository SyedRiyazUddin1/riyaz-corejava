package com.corejava.java8.streams;

/* 
 * A simple program that reads a text file line-by-line using Java8 (Streams).
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamsFromFileDemo {

	public static void main(String[] args) {

		String fName = "D:/Java Programs/TestFile.txt";

		// Method #1 - Read all lines as a Stream
		fileStreamUsingFiles(fName);
		System.out.println();

		// Method #2 - Read file with a filter
		filterFileData(fName);
		System.out.println();

		// Method #3 - In Java8, 'BufferedReader' has the 'lines()' method which returns
		// the file content as a Stream
		fileStreamUsingBufferedReader(fName);
	}

	// Method #1
	private static void fileStreamUsingFiles(String fileName) {
		try {
			Stream<String> lines = Files.lines(Paths.get(fileName));
			System.out.println("<!-----Read all lines as a Stream-----!>");
			lines.forEach(System.out::println);
			lines.close();
		} catch (IOException io) {
			io.printStackTrace();
		}
	}

	// Method #2
	private static void filterFileData(String fileName) {
		try {
			Stream<String> lines = Files.lines(Paths.get(fileName)).filter(line -> line.startsWith("H"));
			System.out.println("<!-----Filtering the file data using Java8 filtering-----!>");
			lines.forEach(System.out::println);
			lines.close();
		} catch (IOException io) {
			io.printStackTrace();
		}
	}

	// Method #3
	private static void fileStreamUsingBufferedReader(String fileName) {
		try {
			BufferedReader br = Files.newBufferedReader(Paths.get(fileName));
			Stream<String> lines = br.lines().map(str -> str.toUpperCase());
			System.out.println("<!-----Read all lines by using BufferedReader-----!>");
			lines.forEach(System.out::println);
			lines.close();
		} catch (IOException io) {
			io.printStackTrace();
		}
	}
}
