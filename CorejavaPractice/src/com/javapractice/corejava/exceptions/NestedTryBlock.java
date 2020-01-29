package com.javapractice.corejava.exceptions;

public class NestedTryBlock{  
	 public static void main(String args[]){  
	  try{  
	    try{  
	     System.out.println("going to divide");  
	     int number =39/0;  
	    }catch(ArithmeticException e){System.out.println(e);}  
	   
	    try{  
	    int myArray[]=new int[5];  
	    myArray[5]=4;  
	    }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
	     
	    System.out.println("other statement");  
	  }catch(Exception e){System.out.println("handeled");}  
	  
	  System.out.println("normal flow..");  
	 }  
	}
