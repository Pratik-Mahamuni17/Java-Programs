package com.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine().toLowerCase();

        // Step 1: Count frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Collect non-repeating characters in order
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (freqMap.get(c) == 1) {
                if (result.length() > 0) {
                    result.append(","); // Add comma before next character
                }
                result.append(c);
            }
        }

        // Step 3: Print result or a message if none
        if (result.length() == 0) {
            System.out.println("No non-repeating characters found.");
        } else {
            System.out.println("Output: " + result.toString());
        }
        sc.close();
    }
}
