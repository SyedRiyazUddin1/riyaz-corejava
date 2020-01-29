package com.javapractice.corejava.filehandling.bytestreams;

import java.io.FileInputStream;

public class FileInputStreamDemo2 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("D:\\\\Java Programs\\\\TestFile.txt");
            int loop = 0;
            while ((loop = fin.read()) != -1) {
                System.out.print((char) loop);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
