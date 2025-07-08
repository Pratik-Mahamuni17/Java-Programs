package com.array;

import java.util.HashSet;
import java.util.Set;

public class ReplaceByRank {
	public static void main(String[] args) {
		int[] arr = { 20 ,15 ,26, 2, 98, 6};
		
		for(int i = 0;i <arr.length;i++) {
			Set<Integer> s = new HashSet<>();
			for(int j = 0; j < arr.length;j++) {
				 if(arr[j] < arr[i]) {
					 s.add(arr[j]);
				 }
			}
			int rank = s.size() + 1;
			System.out.print(rank + " ");
			
		}
		
	}
}
