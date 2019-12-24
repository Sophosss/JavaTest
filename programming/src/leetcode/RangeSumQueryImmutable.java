package leetcode;

public class RangeSumQueryImmutable {
	int[] dp;
	public RangeSumQueryImmutable(int[] nums) {
		if(nums == null || nums.length == 0) return;
		dp = new int[nums.length];
		dp[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			dp[i] = dp[i-1] + nums[i];
		}
	}

	public int sumRange(int i, int j) {
		if(dp == null || dp.length == 0) return 0;
		else if(i == 0) return dp[j];
		else return dp[j] - dp[i-1];
	}
}
