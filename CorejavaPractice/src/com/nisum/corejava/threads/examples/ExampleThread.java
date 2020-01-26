package com.nisum.corejava.threads.examples;

//creating threads by extending Thread class
class Example1 extends Thread //this class is extending thread class in order to create a thread
{
    public void run() {
        int count;
        for (count = 0; count < 3; count++)
            System.out.println("Thread of Example1 " + count);
    }
}

class Example2 extends Thread {
    public void run() {

        int loop;
        for (loop = 0; loop < 3; loop++)
            System.out.println("Thread of Example2 " + loop);
    }
}

public class ExampleThread {
    public static void main(String[] args) {
        Example1 t1 = new Example1();
        Example2 t2 = new Example2();
        t1.start();
        t2.start();
    }
}
