package com.numberproblem;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		
		int org = num;
		int rev = 0;
		
		while(num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num /= 10;
		}
		
		if(org == rev) {
			System.out.println(org + " is a palindrome number.");
		} else {
			System.out.println(org + " is not a palindrome number.");
		}
		
		sc.close();
	}
}
