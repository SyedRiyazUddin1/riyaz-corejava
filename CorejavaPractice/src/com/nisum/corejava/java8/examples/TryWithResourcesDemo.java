package com.nisum.corejava.java8.examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResourcesDemo {
	public static void main(String[] args) throws Exception {
		BufferedReader br=null;
		try {
			String str = "";
			br = new BufferedReader(new InputStreamReader(System.in));
			str = br.readLine();
		}
		catch (Exception e){
			System.out.println(e);
		}
		finally
		{
			br.close();			
		}
								
		}
	}
		
		
	
//		//try-with-resources
//		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
//			String str = "";
//			str = br.readLine();
//			System.out.println("Hello " +str);
//		}
//
//		
//
//	}
//
//}
