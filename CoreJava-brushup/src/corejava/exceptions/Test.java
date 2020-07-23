package com.corejava.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args) {
//Without try catch, compiler won't compile the program
		try {
			FileInputStream fis = new FileInputStream("d:/abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End of code here");
	}
	
	
}
