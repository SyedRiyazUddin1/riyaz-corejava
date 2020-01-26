package com.nisum.corejava.threads.examples;

//program to create a Thread by implementing Runnable interface

public class ThreadDemo1 implements Runnable {
    //overriding the run() method of Runnable interface here
    @Override
    public void run() {
        System.out.println("This is My Thread");
    }

    public static void main(String[] args) {
        Thread myThread = new Thread(new ThreadDemo1());
        myThread.start();
    }
}
