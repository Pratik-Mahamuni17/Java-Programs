package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*  Given an array of integers, having some duplicate elements,
 *  sort the array by frequency.  
 *  Example 1:
 *	Input: N = 8, array[] = {1,2,3,2,4,3,1,2}
 *	Output: 2 2 2 1 1 3 3 4 
	Explanation: Since  2 is present 3 times in an array , so print 
 *	it 3 times ,then print ‘1’ 2 times and then ‘3’ 2 times and 4 has 
 *	least frequency, it will be printed at last.
 * */

public class SortByFrequency {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 4, 3, 1, 2 };

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		List<Integer> list = new ArrayList<>();
		for (int num : arr) {
			list.add(num);
		}

		// Step 3: Sort list by frequency (high to low)
		Collections.sort(list, new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				int freqA = map.get(a);
				int freqB = map.get(b);
				if (freqA != freqB) {
					return freqB - freqA; // Higher frequency comes first
				} else {
					return 0; // Keep order as-is if frequency is same
				}
			}
		});

		// Step 4: Print sorted list
		for (int num : list) {
			System.out.print(num + " ");
		}
	}

}
