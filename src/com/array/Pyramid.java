package com.array;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter : ");
		int rows = sc.nextInt();
		sc.close();
		for (int i = 1; i <= rows; i++) {
			
			// Print Spaces
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			// Print Stars
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
