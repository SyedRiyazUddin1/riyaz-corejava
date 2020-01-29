//program of values overwriting in multiple static blocks

package com.javapractice.corejava.staticblock_constructors.examples;

public class MultipleStaticBlocks {

    static int marks;
    static String studentName;

    //Static block 1
    static {
        System.out.println("Static Block 1");
        marks = 68;
        studentName = "Riyaz";
    }

    //Static block 2
    static {
        System.out.println("Static Block 2");
        marks = 98;
        studentName = "Raj";
    }

    public static void main(String args[]) {

        //values of static block1 will overwritten by values of static block 2
        System.out.println("Value of num: " + marks);
        System.out.println("Value of mystr: " + studentName);
    }
}

