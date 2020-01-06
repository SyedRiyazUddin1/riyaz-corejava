package com.nisum.corejava.threads.examples;

class ThreadB extends Thread {
	
    int total;
    @Override
    public void run() {
        synchronized(this){
            for(int i=0; i<10 ; i++){
                total += i;
                try {
                	sleep(2000);
                }catch(InterruptedException ex){
                	ex.printStackTrace();
                }
                
            }
            System.out.println("Value of Total :" + total);
           
        }
    }
}