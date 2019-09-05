package leetcode;

public class TargetSum {
	int count = 0;
	public int findTargetSumWays(int[] nums, int S) {
		if(nums == null || nums.length == 0) return 0;
		recur(nums, 0, 0, S);
		return count;
	}
	private void recur(int []nums, int sum, int k, int target){
		if(k == nums.length) {
			if(sum == target) count++;
			return;
		}else{
			recur(nums, sum + nums[k], k + 1, target);
			recur(nums, sum - nums[k], k + 1, target);
		}

	}
}
