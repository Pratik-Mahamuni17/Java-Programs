package com.strings;

import java.util.Scanner;

public class FindLargestWord {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		
		String[] words = s.split(" ");
		
		int largest = 0;
		String largestWord = "";
		for(String word : words ) {
			if(word.length() > largest) {
				largest = word.length();
				largestWord = word;
			}
		}
		System.out.println("Largest Word : " + largestWord + " "+  largest);
		sc.close();
	}

}
