package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<>();
		int[][] dp = new int[numRows][numRows];
		for (int i = 0; i < numRows; i++) {
			List<Integer> l2 = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				if (j == 0) dp[i][j] = 1;
				else dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
				l2.add(dp[i][j]);
			}
			list.add(l2);
		}
		return list;
	}
}
