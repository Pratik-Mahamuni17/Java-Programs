package com.strings;

import java.util.Scanner;

public class AsciiValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); // Read first character of input
        int ascii = (int) ch; // Cast char to int to get ASCII
        System.out.println("ASCII value of '" + ch + "' is: " + ascii);
        sc.close();
    }
}
