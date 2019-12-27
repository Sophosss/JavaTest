package leetcode;

public class WiggleSubsequence {
	public int wiggleMaxLength(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		if(nums.length == 1) return 1;
		int[] dp = new int[nums.length];
		int a = nums[0];
		int b = 0;
		for (int i = 1; i < nums.length; i++) {
			if(nums[i] != a) {
				b = nums[i];
				break;
			}
		}
		dp[0] = b - a > 0 ? 0 : 1;
		for (int i = 1; i < nums.length; i++) {
			if(nums[i] > nums[i-1]) dp[i] = dp[i-1] == 0 ? dp[i-1] + 1 : dp[i-1];
			else if(nums[i] < nums[i-1]) dp[i] = dp[i-1] == 1 ? dp[i-1] - 1 : dp[i-1];
			else dp[i] = dp[i-1];
		}
		int count = 0;
		int cur = dp[0];
		for (int i = 1; i < dp.length; i++) {
			if(Math.abs(dp[i] - cur) != 1) continue;
			else{
				count++;
				cur = dp[i];
			}
		}
		return count;
	}
}
