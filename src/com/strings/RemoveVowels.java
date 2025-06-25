package com.strings;

import java.util.Scanner;

public class RemoveVowels {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = sc.nextLine().toLowerCase(); 
        String rem = "";
        
        for (char c : s.toCharArray()) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                rem += c;
            }
        }
        
        System.out.println("String without vowels: " + rem);
        sc.close();
    }
}
