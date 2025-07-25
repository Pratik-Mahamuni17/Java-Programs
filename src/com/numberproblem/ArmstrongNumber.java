package com.numberproblem;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		
		int originalNum = num;
		int sum = 0;
		int digits = String.valueOf(num).length(); 
		
		while(num > 0) {
			int digit = num % 10;
			sum += Math.pow(digit, digits);
			num /= 10;
		}
		
		if(originalNum == sum) {
			System.out.println(originalNum + " is an Armstrong number.");
		} else {
			System.out.println(originalNum + " is not an Armstrong number.");
		}
		
		sc.close();
	}
}
