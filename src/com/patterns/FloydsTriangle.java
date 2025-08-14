package com.patterns;

public class FloydsTriangle {
	 public static void main(String[] args) {
	        int rows = 4;
	        int num = 1; // starting number

	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(num + " ");
	                num++; // move to next number
	            }
	            System.out.println();
	        }
	    }
	/*
	 * OutPut
	 * 
	 *			1 
	 *			2 3 
	 *			4 5 6 
	 *			7 8 9 10 
	 */
	 

}
