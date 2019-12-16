package leetcode;

public class BurstBalloons {
	public int maxCoins(int[] nums) {
		int[] arrs = new int[nums.length + 2];
		arrs[0] = 1;
		arrs[arrs.length - 1] = 1;
		int[][] dp = new int[arrs.length][arrs.length];
		for (int i = 1; i <= nums.length; i++) arrs[i] = nums[i-1];
		for (int len = 2; len < arrs.length; len++) {
			for (int i = 0; i < arrs.length - len; i++) {
				for (int j = i+1; j < i + len; j++) {
					dp[i][i+len] = Math.max(dp[i][i+len], dp[i][j] + dp[j][i+len] + arrs[i]*arrs[j]*arrs[i+len]);
				}
			}
		}
		return dp[0][arrs.length-1];
	}
}
