//Program using Try-with-resources
package com.javapractice.corejava.java8.try_with_resources.examples;

import java.io.FileInputStream;

public class TryWithResourcesDemo2 {
    public static void main(String[] args) {
//wirting a Try-statement that declares resources where we need not to worry about closing the resources
        try (FileInputStream fin = new FileInputStream("D:\\\\Java Programs\\\\TestFile.txt");) {

            int loop = 0;
            while ((loop = fin.read()) != -1) {
                System.out.print((char) loop);
            }
        } catch (Exception excpObj) {
            System.out.println(excpObj);
        }
    }

}
