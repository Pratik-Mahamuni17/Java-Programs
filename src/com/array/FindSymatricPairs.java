package com.array;

public class FindSymatricPairs {

	public static void main(String[] args) {
		int[][] pairs = { { 1, 2 }, { 2, 1 }, { 3, 4 }, { 4, 5 }, { 5, 4 } };
		
		for(int i = 0;i < pairs.length;i++) {
			for(int j = i+1;j < pairs.length;j++) {
				if(pairs[j][0] == pairs[i][1] && pairs[j][1] == pairs[i][0]) {
					System.out.print("(" + pairs[i][1] + " " + pairs[i][0] + ")" + " ");
                    break;
				}
			}
		}
		
	}

}
