package com.nisum.corejava.collectionsframework;

import java.io.*;

public class FOutDemo {
	public static void main(String []args) throws IOException {
		int i;
		FileOutputStream fout;
		fout=new FileOutputStream("‪‪D:\\Java Programs\\FOutDemo.txt");
		String s="TATA";
		
		char ch[]=s.toCharArray();
		for(i=0;i< s.length();i++)
			fout.write(ch[i]);
		fout.close();
	}

}
