package com.javapractice.corejava.filehandling.serialization_deserialization;

import java.io.*;
public class SerializeDemo {

   public static void main(String [] args) {
      EmployeeDemo e = new EmployeeDemo ();
      e.name = "Syed Riyaz Uddin";
      e.address = "Hyderabad, Telangana";
      e.aadhar = 38555822;
      e.number = 101;
      
      try {
         FileOutputStream fileOut = new FileOutputStream("D:\\Java Programs\\Serialize Demo.txt");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         
         fileOut.close();
         System.out.println("Serialized data is saved in D:\\Java Programs\\Serialize Demo.txt");
      } catch (IOException i) {
         i.printStackTrace();
      }
   }
}
