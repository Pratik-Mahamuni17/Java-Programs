package com.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfChracters {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		
		
		HashMap<Character,Integer> map = new  HashMap<>();
		
		for(char c : s.toCharArray()) {
			if(c != ' ') {
				map.put(c, map.getOrDefault(c, 0)+ 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		sc.close();
	}
}
