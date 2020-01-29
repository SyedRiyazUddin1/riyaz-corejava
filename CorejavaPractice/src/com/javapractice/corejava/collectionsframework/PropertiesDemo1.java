package com.javapractice.corejava.collectionsframework;

import java.util.Properties; //importing Properties class
import java.io.*;

public class PropertiesDemo1 {
	public static void main(String []args) throws Exception {
		
		//creating an object of FileReader Class and passing the path of the properties file
		FileReader reader = new FileReader("D:\\Java Programs\\db info.txt");
	    
		//creating the object of Properties Class and loading it (Reads a property list (key and element pairs) from the input character stream.
		Properties p=new Properties();
	    p.load(reader);
	    
	    System.out.println(p.getProperty("admin"));
	    System.out.println(p.getProperty("password"));
	    System.out.println(p.getProperty("status"));
	    System.out.println(p.getProperty("admin"));
	  
	}
}
