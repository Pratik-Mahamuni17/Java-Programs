package com.strings;

import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c); // keep special characters as-is
            }
        }

        System.out.println("Changed Case String: " + result.toString());
        sc.close();
    }
}
