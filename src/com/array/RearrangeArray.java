package com.array;

import java.util.Arrays;

/*
 * Rearrange the array such that the first half is arranged in 
 * increasing order, and the second half is arranged in decreasing 
 * order
 */
public class RearrangeArray {

	public static void main(String[] args) {
        int[] arr = {4, 2, 8, 6, 15, 5, 9, 20};

        // Step 1: Sort the entire array
        Arrays.sort(arr);

        int n = arr.length;
        int mid = n / 2;

        System.out.println("Rearranged array:");

        // Step 2: Print first half (ascending)
        for (int i = 0; i < mid; i++) {
            System.out.print(arr[i] + " ");
        }

        // Step 3: Print second half (descending)
        for (int i = n - 1; i >= mid; i--) {
            System.out.print(arr[i] + " ");
        }
    }

}
 