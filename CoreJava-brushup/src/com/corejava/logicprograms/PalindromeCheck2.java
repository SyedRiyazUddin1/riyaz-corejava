package com.corejava.logicprograms;

//Program to check whether a string is palindrome or not

public class PalindromeCheck2 {

	public static void main(String[] args) {
		
		String s1 = "Madam";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--){

		s2=s2+s1.charAt(i);
		}
		if (s1.equalsIgnoreCase(s2)){
		System.out.println("String is Palindrome");
		} else{
		System.out.println("String is not palindrome");
		}

	}

}
