package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PascalsTriangleTwo {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> list = new ArrayList<>();
		if(rowIndex < 0) return list;
		int[] dp = new int[rowIndex+1];
		for(int i = 0; i <= rowIndex; i++){
			for(int j = i; j >= 0; j--){
				if(j == 0) dp[j] = 1;
				else dp[j] += dp[j-1];
			}
		}
		for(int a : dp) list.add(a);
		return list;
	}

	public static void main(String[] args) {
		PascalsTriangleTwo pascalsTriangleTwo = new PascalsTriangleTwo();
		pascalsTriangleTwo.getRow(3);
	}
}
