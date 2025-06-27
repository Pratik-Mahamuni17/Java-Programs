package com.strings;

import java.util.Scanner;

public class RemoveBrackets {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an algebraic expression: ");
		String s = sc.nextLine();
		StringBuilder output = new StringBuilder();
		
		for(char c : s.toCharArray()) {
			if(c != '(' && c != ')') {
				output.append(c);
			}
		}
		 System.out.println("Expression after removing brackets: " + output);
		
	}

}
