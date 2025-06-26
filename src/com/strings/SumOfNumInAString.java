package com.strings;

import java.util.Scanner;

public class SumOfNumInAString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = sc.nextLine();

        int sum = 0;
        String temp = "0";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                temp += c;  // Append digit to temp string
            } else {
                sum += Integer.parseInt(temp);  // Add the complete number
                temp = "0";  // Reset temp
            }
        }

        // Add any number remaining at the end
        sum += Integer.parseInt(temp);

        System.out.println("Sum of numbers: " + sum);
    }
}
