package com.nisum.corejava.threads.examples;

class Test1 implements Runnable // this class is implementing Runnable interface in order to create a thread
{
	public void run() // overriding method
	{
		int count;
		for (count = 0; count <= 5; count++)
			System.out.println("Thread of Test1 " + count);
	}
}

class Test2 implements Runnable // this class is implementing Runnable interface in order to create a thread
{
	public void run() // overriding method
	{
		int count;
		for (count = 0; count <= 3; count++)
			System.out.println("Thread of Test2 " + count);
	}
}

public class ExampleRunnable {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Test1());
		Thread t2 = new Thread(new Test2());
		t1.start();
		t2.start();
	}
}
