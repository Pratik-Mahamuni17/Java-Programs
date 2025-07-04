package com.array;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		int [] arr = {1,23,3,4,5,6,1,4,5,5};
		
		int [] temp = new int [arr.length];
		
		int count = 0;
		
		for(int i = 0;i < arr.length;i++) {
			boolean isDuplicate = false;
			
			for(int j = 0;j < count;j++) {				
				if(arr[i] == temp[j]) {
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate) {
				temp[count] = arr[i];
				count++;
			}
		}
		
		System.out.print("After Removing: ");
		for(int i = 0;i < count;i++) {
			System.out.print(temp[i] + " ,");
		}
		
		
	}
	
}
