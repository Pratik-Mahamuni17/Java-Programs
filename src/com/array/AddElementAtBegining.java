package com.array;

import java.util.Arrays;

public class AddElementAtBegining {

    public static void main(String[] args) {
        int[] arr = {6, 7, 9, 5, 3, 10};
        int[] newArray = new int[arr.length + 1];

        // Add the new element at the beginning
        newArray[0] = 12;

        // Shift original elements to the right
        for (int i = 0; i < arr.length; i++) {
            newArray[i + 1] = arr[i];
        }

        System.out.println("Array after adding element at beginning: " + Arrays.toString(newArray));
    }
}
