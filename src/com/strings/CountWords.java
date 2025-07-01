package com.strings;

import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine().trim();

		if (s.isEmpty()) {
			System.out.println("Word Count: 0");
		} else {
			String[] words = s.split("\\s+"); // handles multiple spaces, tabs, etc.
			System.out.println("Word Count: " + words.length);
		}

		sc.close();
	}
}
