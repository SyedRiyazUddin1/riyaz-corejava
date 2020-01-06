package com.nisum.corejava.string.examples;

public class StringBufferExample {
public static void main (String[] args) {
	String str1 = "Welcome to Java World!";
	System.out.println(str1);
	
// making String mutable by using StringBuilder or StringBuffer//
    StringBuffer sb = new StringBuffer(str1);
    sb.append(" Good").append(" morning.");
    System.out.println(sb);
    System.out.println(sb.length());
    
    sb.insert(0, "Most ");
    System.out.println(sb);
    
    sb.append(" Hello ");
    System.out.println(sb);
    
    sb.delete(1,6);
    System.out.println(sb);
}
} 