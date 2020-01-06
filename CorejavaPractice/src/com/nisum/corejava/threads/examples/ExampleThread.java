package com.nisum.corejava.threads.examples;

class Example1 extends Thread //this class is extending thread class in order to create a thread
{
	public void run() {
	int i;
	for (i = 0; i <=2; i++)
		System.out.println("Thread of Test1 " + i);
	}
}

class Example2 extends Thread {
	public void run() {
	
		int i;
	for (i = 0; i <=2; i++)
		System.out.println("Thread of Test2 " + i);
	}
	}


public class ExampleThread {
 public static void main (String[]args) {
	 Example1 t1 = new Example1();
	 Example2 t2 = new Example2();
	 t1.start();
	 t2.start();
	 try {
		Thread.sleep(3000);
		System.out.println("Waited till 3 seconds");
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
 }
}
