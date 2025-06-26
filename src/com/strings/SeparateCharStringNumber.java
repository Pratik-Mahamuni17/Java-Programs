package com.strings;

import java.util.Scanner;

public class SeparateCharStringNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a mixed string: ");
        String input = sc.nextLine();

        String letters = "";
        String digits = "";
        String symbols = "";

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letters += c;
            } else if (Character.isDigit(c)) {
                digits += c;
            } else {
                symbols += c; // for spaces, special characters
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Symbols: " + symbols);
        
        sc.close();
    }
}

