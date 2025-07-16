package com.strings;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		String newStr = "";
		for(char c : s.toCharArray()) {
			if(c != ' ') {
				newStr += c;
			}
		}
		System.out.println("After Removing White Spaces : "+newStr);
	}

}
