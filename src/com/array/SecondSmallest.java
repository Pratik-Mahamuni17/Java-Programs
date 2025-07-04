package com.array;

public class SecondSmallest {

	public static void main(String[] args) {
		
		int arr[] = { 4, 100, 600, 11, 9, 53, 21, 300 };
		
		int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
		
		for(int num : arr) {
			if(num < first) {
				second = first;
				first = num;
			}else if(num < second && num > first) {
				second = num;
			}
		}
		System.out.println("Second Smallest Element In Array: " + second);

	}

}
