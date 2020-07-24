package com.corejava.java8;

import com.corejava.util.MyLogger;

//No need to create the below class when we use Lambda Expression

//class RunnableTest implements Runnable {
//
//	@Override
//	public void run() {
//		for (int loop = 0; loop <= 10; loop++) {
//			MyLogger.consoleLogger.info("CHILD thread is running..");
//		}
//
//	}
//}

public class RunnableLambdaDemo {
	public static void main(String[] args) {

		
		//RunnableTest runnable = new RunnableTest();
		
		//using Lamda expression
		Runnable runnable = ()->{
			for (int loop = 0; loop <= 10; loop++) {
				MyLogger.consoleLogger.info("CHILD thread is running..");
			}
		};
		
		Thread t1 = new Thread(runnable);
		t1.start();

		for (int loop = 0; loop <= 10; loop++) {
			MyLogger.consoleLogger.info("MAIN thread is running..");
		}

	}
}
