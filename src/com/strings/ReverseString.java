package com.strings;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // To read input
        System.out.println("Enter a String: ");
        String s = sc.nextLine(); // Read full line of input
        String reversed = "";

        // Reversing the string by prepending characters
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            reversed = c + reversed;
        }

        System.out.println("Reversed String: " + reversed);
        sc.close(); // Good practice to close the scanner
    }
}
