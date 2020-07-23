package com.corejava.threads;

public class SleepMethodDemo implements Runnable {

	public static void main(String[] args) {
		Thread t = new Thread();
		t.start();
		
	}

	public void run() {
		try {
			Thread.sleep(2000);
			System.out.println("Sleep method executed");
		} catch (InterruptedException e) {
		}
	}
}