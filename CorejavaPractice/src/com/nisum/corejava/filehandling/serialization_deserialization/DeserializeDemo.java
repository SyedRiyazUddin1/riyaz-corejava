package com.nisum.corejava.filehandling.serialization_deserialization;

import java.io.*;
public class DeserializeDemo {

   public static void main(String [] args) {
      EmployeeDemo e = null;
      try {
         FileInputStream fileIn = new FileInputStream("D:\\Java Programs\\Serialize Demo.txt");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         e = (EmployeeDemo) in.readObject();
         in.close();
         fileIn.close();
      } catch (IOException i) {
         i.printStackTrace();
         return;
      } catch (ClassNotFoundException c) {
         System.out.println("Employee class not found");
         c.printStackTrace();
         return;
      }
      
      System.out.println("Deserialized Employee...");
      System.out.println("Name: " + e.name);
      System.out.println("Address: " + e.address);
      System.out.println("aadhar: " + e.aadhar);
      System.out.println("Number: " + e.number);
   }
}
