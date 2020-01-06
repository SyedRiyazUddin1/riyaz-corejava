package com.nisum.corejava.threads.examples;

public class ThreadWaitMethodExample {
	
	public static void main(String args[]) {
		
		ThreadB threadb = new ThreadB();
		threadb.start();
		
		 synchronized(threadb){
		 try{
             System.out.println("Waiting for threadb to complete...");
             threadb.wait();
         }catch(InterruptedException e){
             e.printStackTrace();
         }
		}
		 
		 System.out.println("Total is: " + threadb.total);
		
	}

}
