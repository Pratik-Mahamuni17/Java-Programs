package com.strings;

import java.util.Scanner;

public class FindSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text: ");
        String text = sc.nextLine();

        System.out.println("Enter the pattern to search: ");
        String pattern = sc.nextLine();

        // Edge case: pattern longer than text
        if (pattern.length() > text.length()) {
            System.out.println("-1");
            return;
        }

        // Check for substring match
        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            if (text.substring(i, i + pattern.length()).equals(pattern)) {
                System.out.println(i); // Found at index i
                return;
            }
        }

        // If no match found
        System.out.println("-1");
        sc.close();
    }
}
