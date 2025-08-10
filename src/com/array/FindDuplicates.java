package com.collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicates {
//	Find duplicate elements in a list.
	
	public static <T> List<T> findDuplicates(List<T> list){
		Map<T,Integer> map = new HashMap<>();
		for(T element : list ) {
			map.put(element, map.getOrDefault(element, 0)+1);			
		}
		
		List<T> duplicates = new ArrayList<T>();
		
		for(Map.Entry<T,Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1) {
				duplicates.add(entry.getKey());
			}
		}
		return duplicates;		
	}
	
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(12,24,21,34,21,12,24,2,3);
		System.out.println(findDuplicates(intList));
		
		List<String> stringList = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
		System.out.println(findDuplicates(stringList));	
		
	}
}
