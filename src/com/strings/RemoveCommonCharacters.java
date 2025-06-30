package com.strings;

import java.util.Scanner;

public class RemoveCommonCharacters {
	/*
	 * Given two strings, write a program to remove characters from the first string
	 * which are present in the second string.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String 1: ");
		String s1 = sc.nextLine();
		System.out.println("Enter a String 2: ");
		String s2 = sc.nextLine();

		StringBuilder rem = new StringBuilder();

		for (int i = 0; i < s1.length(); i++) {
			int flag = 0;
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					flag = 1;
					break;
				}
			}
			if (flag != 1) {
				rem.append(s1.charAt(i));
			}
		}
		System.out.println(rem.toString());
		sc.close();
	}

}
