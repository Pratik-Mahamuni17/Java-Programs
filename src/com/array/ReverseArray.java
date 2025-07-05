package com.array;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		int arr[] = { 4, 100, 600, 11, 9, 53, 21, 300 };
		
		for(int i = arr.length -1;i >= 0;i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
