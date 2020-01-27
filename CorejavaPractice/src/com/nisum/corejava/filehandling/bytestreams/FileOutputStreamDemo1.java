package com.nisum.corejava.filehandling.bytestreams;

import java.io.FileOutputStream;

public class FileOutputStreamDemo1 {
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\Java Programs\\TestOut.txt");
			fout.write(69);
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
//The content of a text file testout.txt is set with the data A.