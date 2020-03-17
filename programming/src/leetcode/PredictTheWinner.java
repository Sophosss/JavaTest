package leetcode;

public class PredictTheWinner {
	public boolean PredictTheWinner(int[] nums) {
		if(nums.length % 2 == 0) return true;
		int[][] dp = new int[nums.length][nums.length+1];
		for(int i = nums.length-1; i >= 0; i--){
			for (int j = i+1; j < nums.length; j++) {
				dp[i][j] = Math.max(nums[i] - dp[i+1][j], nums[j] - dp[i][j-1]);
			}
		}
		return dp[0][nums.length-1] >= 0;
 	}
}
