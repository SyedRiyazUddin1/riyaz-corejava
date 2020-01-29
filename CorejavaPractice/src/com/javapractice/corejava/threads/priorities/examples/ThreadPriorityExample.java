package com.javapractice.corejava.threads.priorities.examples;

class Thread1 extends Thread {
    public void run() {
        System.out.println("Priority of thread1 is: " + getPriority());
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println("Priority of thread2 is: " + getPriority());
    }
}

public class ThreadPriorityExample {
    public static void main(String args[]) {
        // creating two threads
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread2 t3 = new Thread2();
        // printing the maximum priority of this thread
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(5);
        t1.setPriority(9);
        t1.start();
        t2.start();
        t3.start();
    }
}
