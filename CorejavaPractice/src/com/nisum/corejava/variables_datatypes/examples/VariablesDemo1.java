package com.nisum.corejava.variables_datatypes.examples;

class VariablesDemo1 {

    int num1 = 55; //instance variable
    static int num2 = 10; //static variable with keyword "static"

    static void method1() {
        int b = 90; //local variable
        System.out.println("Local variable declared in this method1");
    }

    //main method
    public static void main(String[] args) {
        method1();
    }
}