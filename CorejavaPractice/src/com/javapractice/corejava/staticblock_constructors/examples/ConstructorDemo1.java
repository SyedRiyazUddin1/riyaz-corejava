//program to create a constructor
package com.javapractice.corejava.staticblock_constructors.examples;

public class ConstructorDemo1 {
    String name;

    //Creating a Constructor
    ConstructorDemo1() {
        this.name = "Syed Riyaz Uddin";
    }

    public static void main(String[] args) {
        ConstructorDemo1 obj = new ConstructorDemo1();
        System.out.println(obj.name);
    }
}