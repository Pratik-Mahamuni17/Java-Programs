package com.mockinterview;

import java.util.Arrays;

public class Anagram {

    // Method to check if two strings are anagrams
    public static boolean isAnagram(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths differ, not an anagram
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert to char arrays and sort
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";

        if (isAnagram(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are NOT anagrams.");
        }
    }
}
