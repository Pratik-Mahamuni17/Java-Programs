package com.strings;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine().trim();

		StringBuilder result = new StringBuilder();

		for (char c : s.toCharArray()) {
			if (c != ' ') {
				result.append(c);
			}
		}
		s = result.toString();
		System.out.println(s);
	}
}