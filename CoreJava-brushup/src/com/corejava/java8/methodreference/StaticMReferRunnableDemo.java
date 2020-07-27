package com.corejava.java8.methodreference;

import com.corejava.util.MyLogger;

public class StaticMReferRunnableDemo {

	public static void m1() {
		for (int loop = 0; loop <= 10; loop++) {
			MyLogger.consoleLogger.info("CHILD thread is running..");
		}

	}

	public static void main(String[] args) {

		// using Lamda expression
//		Runnable runnable = () -> {
//			for (int loop = 0; loop <= 10; loop++) {
//				MyLogger.consoleLogger.info("CHILD thread is running..");
//			}
//		};
		
		//using static method reference
		Runnable runnable = StaticMReferRunnableDemo::m1;

		Thread t1 = new Thread(runnable);
		t1.start();

		for (int loop = 0; loop <= 10; loop++) {
			MyLogger.consoleLogger.info("MAIN thread is running..");
		}

	}
}
