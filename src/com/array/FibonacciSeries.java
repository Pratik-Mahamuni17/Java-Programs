package com.array;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many terms you want: ");
		int n = sc.nextInt();
		sc.close();
		int first = 0, second = 1;
		System.out.print("Fibonacci Series: " + first + " " + second + " ");

		for (int i = 2; i < n; i++) {
			int next = first + second;
			System.out.print(next + " ");
			first = second;
			second = next;
		}
	}

}
