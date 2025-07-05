package com.array;

public class SumOfArray {

	public static void main(String[] args) {
		
		int arr[] = { 4, 100, 600, 11, 9, 53, 21, 300 };
		
		int sum = 0;
		
		for(int i = 0; i < arr.length;i++) {
			sum += arr[i];
		}
		System.out.println("Sum of the array : " + sum);
	}

}
