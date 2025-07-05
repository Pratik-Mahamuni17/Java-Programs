package com.array;

public class SecondLargest {

	public static void main(String[] args) {
		
		int arr[] = { 4, 100, 600, 11, 9, 53, 21, 300 };
		
		int first = Integer.MIN_VALUE , second = Integer.MIN_VALUE;
		
		for(int num :arr) {
			if(num > first) {
				second = first;
				first = num;
			}else if(num < first && num > second) {
				second = num;
			}
		}
		System.out.println("Second Largest Number : " + second);
	}

}
