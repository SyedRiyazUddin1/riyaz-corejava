package com.nisum.corejava.filehandling.characterstreams;

import java.util.*;
import java.io.*;

class PropertiesWriteDemo {
	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		p.setProperty("Name", "Syed Riyaz Uddin");
		p.setProperty("Department", "ES");
		p.setProperty("Emp ID", "16044");

		// Creating the properties file below in the specified path
		p.store(new FileWriter("D:\\Java Programs\\Info Properties.txt"), "Employee Details");

		System.out.println(p.getProperty("Name"));
	}
}
