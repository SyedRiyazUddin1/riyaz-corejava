package com.nisum.corejava.collectionsframework;

import java.io.*;

public class FileExample1 {
	public static void main(String []args) throws Exception {
	File f1 = new File("D:\\Java Programs\\File Demo.txt");
	f1.createNewFile();
	System.out.println("Is exist: " + f1.exists());
	System.out.println("File size: " +f1.length());
	//f1.delete(); deletes the file 
	}

}
