package com.strings;

import java.util.Scanner;

public class CapitalizeFirstAndLast {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String input = sc.nextLine();

		String[] words = input.split(" ");
		String result = "";

		for (String word : words) {
			int len = word.length();
			if (len == 1) {
				result += word.toUpperCase() + " ";
			} else {
				result += word.substring(0, 1).toUpperCase() // first letter
						+ word.substring(1, len - 1) // middle part
						+ word.substring(len - 1).toUpperCase() // last letter
						+ " ";
			}
		}

		System.out.println("Result: " + result.trim());
	}

}
