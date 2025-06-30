package com.strings;

import java.util.Scanner;

public class RemoveCharactersExceptAlphabet {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter a String : ");
		String s = sc.nextLine();
		
		String r = "";
		
		for(char ch :s.toCharArray()) {
			if(Character.isLetter(ch)) {
				r += ch;
			}
		}
		System.out.println("After removing characters : " + r);
		sc.close();
	}

}
