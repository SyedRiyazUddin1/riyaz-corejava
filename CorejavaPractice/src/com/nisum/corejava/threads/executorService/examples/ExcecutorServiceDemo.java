package com.nisum.corejava.threads.executorService.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadOne implements Runnable {

    public void run() // overriding method
    {
        int count;
        for (count = 0; count <= 3; count++)
            System.out.println("Thread of ThreadOne " + count);
    }
}

class ThreadTwo implements Runnable // this class is implementing Runnable interface in order to create a thread
{
    public void run() // overriding method
    {
        int count;
        for (count = 0; count <= 3; count++)
            System.out.println("Thread of ThreadTwo " + count);
    }
}

class ExecutorServiceDemo {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new ThreadOne());
        executorService.execute(new ThreadTwo());

        //stops the executor service
        executorService.shutdown();






    }

}
