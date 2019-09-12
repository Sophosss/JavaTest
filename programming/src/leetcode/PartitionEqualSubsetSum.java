package leetcode;

import java.util.Arrays;

public class PartitionEqualSubsetSum {
	public boolean canPartition(int[] nums) {
		if(nums == null || nums.length <= 1) return false;
		int len = nums.length;
		int sum = 0;
		for(int num : nums){
			sum += num;
		}
		if((sum & 1) == 1) return false;
		sum /= 2;
		boolean [][]dp = new boolean[len][sum+1];
		for(int i = 1; i <= sum; i++){
			if(i == nums[0]) dp[0][i] = true;
		}
		for(int i = 1; i < len; i++){
			for(int j = 0; j <= sum; j++){
				dp[i][j] = dp[i-1][j];
				if(j >= nums[i]) dp[i][j] = dp[i-1][j] | dp[i-1][j-nums[i]];
			}
		}
		return dp[len-1][sum];
	}

	public static void main(String[] args) {
		PartitionEqualSubsetSum partitionEqualSubsetSum = new PartitionEqualSubsetSum();
		partitionEqualSubsetSum.canPartition(new int [] {3, 3, 3, 4, 5});
	}
}
