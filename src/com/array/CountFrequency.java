package com.array;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
	
	public static void main(String[] args) {
		
		int arr[] = { 4, 100, 600, 11, 9, 53, 21,9, 300 };
		
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for(int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue() + " times in the array");
		}
	}
}
