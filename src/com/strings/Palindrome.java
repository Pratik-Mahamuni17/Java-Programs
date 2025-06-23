package com.strings;

import java.util.Scanner;

public class Palindrome {	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = sc.nextLine();
		sc.close();
		StringBuilder s1 = new StringBuilder(s);
		
		s1.reverse();				
		
		if(s.equals(s1.toString())) {
			 System.out.println(s + " :is a palindrome string.");
		} else {
			System.out.println("\"" + s + "\" is not a palindrome string.");
		}		
	}	
}
