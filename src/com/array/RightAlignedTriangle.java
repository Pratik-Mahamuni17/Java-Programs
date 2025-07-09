package com.array;

public class RightAlignedTriangle {

    public static void main(String[] args) {
        int n = 5;  // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // Move to next line
            System.out.println();
        }
    }
}
