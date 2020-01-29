package com.javapractice.corejava.java8.examples;

public class RunnableLamdaDemo {
	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Printed inside Runnable");

			}
		});

		myThread.run();

		//instead of writing the abov code, we can write the below lambda expression
		Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Lambda Runnable"));
		myLambdaThread.run();
	}
}
