package com.nisum.corejava.threads.examples;

//program to create threads by implementing Runnable interface
class Test1 implements Runnable // this class is implementing Runnable interface in order to create a thread
{
    public void run() // overriding method
    {
        int count;
        for (count = 0; count <= 3; count++)
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
        try {
            Thread.sleep(2000); //t2 will start after 2 secs pause
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
