package com.strings;

import java.util.Scanner;

public class CountVowelsConsonantSpaces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = sc.nextLine().toLowerCase(); // Convert to lowercase to handle uppercase letters

        int vowel = 0;
        int consonant = 0;
        int spaces = 0;

        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel++;
            } else if (c == ' ') {
                spaces++;
			} else if (c >= 'a' && c <= 'z') { // Only count letters as consonants
                consonant++;
            }
        }

        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
        System.out.println("Spaces: " + spaces);

        sc.close();
    }
}
