package com.array;

import java.util.HashMap;
import java.util.Map;

public class RepeatingElementsInArray {
	public static void main(String[] args) {
		
		int [] arr = {12,11,86,24,53,11,56,24};
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int element : arr) {
			map.put(element, map.getOrDefault(element, 0)+1);
		}
	
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey() + " ");
			}
		}
		
	}
}
