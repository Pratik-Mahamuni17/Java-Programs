package com.mockinterview;

public class HourglassPattern {
    public static void main(String[] args) {
        int n = 3; // Middle part height

        // Top part
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom part
        for (int i = 2; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//output        
//        *****
//         ***
//          *
//         ***
//        *****

    }
}
