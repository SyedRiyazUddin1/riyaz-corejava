package com.corejava.java8;

interface FunctionalInterface {
	public void run();
}

public class LamdaExpDemo2 {

	public static void main(String[] args) {

		FunctionalInterface fInterface = () -> System.out.println("Application is running");

		fInterface.run();
	}
}
