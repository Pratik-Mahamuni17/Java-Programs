package com.numberproblem;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + " : Number is even");
		}else {
			System.out.println(num + " : Number is odd");
		}
		sc.close();
	}

}
