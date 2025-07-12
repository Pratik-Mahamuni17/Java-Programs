package com.array;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an element to search: ");
		int n = sc.nextInt();
		int[] arr = {6, 7, 9, 5, 3, 10};
		
		boolean found = false;
		
		for(int i = 0; i < arr.length; i++) {
			if(n == arr[i]) {
				System.out.println("Element present at index: " + i);
				found = true;
				break;
			}
		}
		
		if(!found) {
			System.out.println("Element not present");
		}
		
		sc.close();
	}
}
