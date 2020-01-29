//program to create object of a class
package com.javapractice.corejava.Classes_Objects.examples;

//creating a class with the name "ClassAndObjectDemo1"
public class ClassAndObjectDemo1 {

    int num1 = 5;
    int num2 = 10;

    public static void main(String[] args) {

        //creating multiple objects of the class with the keyword "new"
        ClassAndObjectDemo1 myObj1 = new ClassAndObjectDemo1();
        ClassAndObjectDemo1 myObj2 = new ClassAndObjectDemo1();
        System.out.println(myObj1.num1);
        System.out.println(myObj2.num2);
    }
}