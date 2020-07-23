package com.corejava.java8;

import com.corejava.util.MyLogger;

interface FunctionalInterface {
	public void run();
}

public class LamdaExpDemo2 {

	public static void main(String[] args) {

		FunctionalInterface fInterface = () -> MyLogger.consoleLogger.info("Application is running");

		fInterface.run();
	}
}
