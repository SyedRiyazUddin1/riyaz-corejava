package com.javapractice.corejava.util;

class Test implements Runnable {  
public 
    void run()  
    {  
        System.out.println("Run");  
    }  
} class Experiment {  
public 
    static void main(String[] args)  
    {  
	Thread mainThread = Thread.currentThread();
	System.out.println(mainThread.getName());
    Thread t = new Thread(new Test()) ; 
    Thread t1 = new Thread(new Test()) ; 
//	Test t = new Test();  
        t.start(); 
        System.out.println(t.getName());
        System.out.println(t1.getName());
    }  
}  
