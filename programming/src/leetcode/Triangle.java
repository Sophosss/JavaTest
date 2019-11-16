package leetcode;

import java.util.List;

public class Triangle {
	public int minimumTotal(List<List<Integer>> triangle) {
		int len = triangle.size();
		int []dp = new int [len+1];
		for(int i = len-1; i >= 0; i--){
			for(int j = 0; j < triangle.get(i).size(); j++){
				dp[j] = Math.min(dp[j], dp[j+1]) + triangle.get(i).get(j);
			}
		}
		return dp[0];
	}
}
