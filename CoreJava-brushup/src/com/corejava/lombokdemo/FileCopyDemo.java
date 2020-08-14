package com.corejava.lombokdemo;

import java.util.Scanner;
import com.corejava.util.MyLogger;
import lombok.Cleanup;

/*
 * Program for @Cleanup demo
 * @Cleanup annotation is used to close the resources
 * If you are using Java version 7 and above, then we can use Try-with-resources 
 */

public class FileCopyDemo {

	public static void main(String[] args) {

		@Cleanup
		Scanner input = new Scanner(System.in);

		String str = input.next();

		MyLogger.consoleLogger.info("Printing the given string: " + str);

	}

}
