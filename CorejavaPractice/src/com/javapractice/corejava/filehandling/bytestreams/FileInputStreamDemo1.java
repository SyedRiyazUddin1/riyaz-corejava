package com.javapractice.corejava.filehandling.bytestreams;

import java.io.FileInputStream;

public class FileInputStreamDemo1 {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("D:\\Java Programs\\TestFile.txt");
			int i = fin.read(); // this method will print only 1 character from the file.
			System.out.print((char) i);

			fin.close();
		} catch (Exception e) {
			System.out.println(e);

		}

	}
}
