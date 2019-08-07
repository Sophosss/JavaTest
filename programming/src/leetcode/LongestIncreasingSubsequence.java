package leetcode;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
	public int lengthOfLIS(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		int []dp = new int [nums.length];
		Arrays.fill(dp, 1);
		for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < i; j++){
				if (nums [j] < nums [i]){
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}
		int max= dp[0];
		for (int i = 0; i < dp.length; i++) {
			if (dp[i] > max){
				max = dp[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int []nums = {10,9,2,5,3,4};
		LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();
		longestIncreasingSubsequence.lengthOfLIS(nums);
	}
}
