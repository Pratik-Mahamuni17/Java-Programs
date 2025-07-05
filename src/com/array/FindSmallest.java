package com.array;

public class FindSmallest {

	public static void main(String[] args) {
		
		int arr[] = { 4, 100, 600, 11, 9, 53, 21, 300 };
		
		if (arr.length == 0) {
			System.out.println("Array is empty.");
			return;
		}
		
		int smallest = Integer.MAX_VALUE;
		
		for (int num : arr) {
			if (num < smallest) {
				smallest = num;
			}
		}
		
		System.out.println("Smallest Number: " + smallest);
	}
}
