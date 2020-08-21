package com.corejava.logicprograms;

import java.util.Arrays;

//Program to check if both the strings are Anagram

public class StringAnagramCheckDemo {
	 
	    public static void main (String [] args) {  
	    	
	    	//creating two strings with same characters
	        String str1="Brag";  
	        String str2="Grab";  
	  
	        //Converting both the string to lower case.  
	        str1 = str1.toLowerCase();  
	        str2 = str2.toLowerCase();  
	  
	        //Checking for the length of strings  
	        if (str1.length() != str2.length()) {  
	            System.out.println("Both the strings are not anagram");  
	        }  
	        else {  
	            //Converting both the arrays to character array  
	            char[] string1 = str1.toCharArray();  
	            char[] string2 = str2.toCharArray();  
	  
	            //Sorting the arrays using in-built function sort ()  
	            Arrays.sort(string1);  
	            Arrays.sort(string2);  
	  
	            //Comparing both the arrays using in-built function equals ()  
	            if(Arrays.equals(string1, string2) == true) {  
	                System.out.println("Both the strings are anagram");  
	            }  
	            else {  
	                System.out.println("Both the strings are not anagram");  
	            }  
	        }  
	    }  
	} 
