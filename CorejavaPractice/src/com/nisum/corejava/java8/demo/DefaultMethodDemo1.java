package com.nisum.corejava.java8.demo;

import com.nisum.corejava.util.MyLogger;

interface Person {
    public void eat();
    default public void walk(){
        MyLogger.consoleLogger.info("Walking...");
    }

}

public class DefaultMethodDemo1 implements Person {

    @Override
    public void eat() {
        MyLogger.consoleLogger.info("Eating...");
    }

    public static void main(String[] args) {
        Person person = new DefaultMethodDemo1();
        person.eat();

    }
}



