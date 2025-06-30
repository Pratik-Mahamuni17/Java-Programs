package com.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxOccuringChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character (ignoring spaces)
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        char maxChar = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        System.out.println("Maximum Occurring Character: '" + maxChar + "' occurred " + maxCount + " times.");
        sc.close();
    }
}
