package com.javapractice.corejava.threads.executorService.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task1 extends Thread {
    int number;

    //creating a constructor of Task1
    public Task1(int number){
        this.number = number;
    }

    public void run() // overriding method
    {
        int count;
        for (count = number*10; count <= number*10 + 5; count++)
            System.out.println("Thread of Task1 " + count);

        System.out.println("\nTask" +number +"Done");
    }
}

class ExecutorServiceDemo2 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Task1(2));
        executorService.execute(new Task1(3));


        //stops the executor service
        executorService.shutdown();


    }

}

