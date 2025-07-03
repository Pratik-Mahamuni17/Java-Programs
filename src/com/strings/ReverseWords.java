package com.strings;

import java.util.Scanner;


/* Given a string s, reverse the words of the string.  */

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        // Split the string into words
        String[] words = s.trim().split("\\s+");

        // Reverse and print
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        System.out.println("Reversed: " + reversed.toString());
        sc.close();
    }
}
