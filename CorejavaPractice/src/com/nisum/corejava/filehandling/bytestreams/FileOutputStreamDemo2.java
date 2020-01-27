package com.nisum.corejava.filehandling.bytestreams;

import java.io.FileOutputStream;

public class FileOutputStreamDemo2 {
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\Java Programs\\TestOut3.xlsx");
			String s = "Welcome to javaWorld";
			byte b[] = s.getBytes();// converting string into byte array
			fout.write(b);
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
