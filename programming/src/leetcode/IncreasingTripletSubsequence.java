package leetcode;

public class IncreasingTripletSubsequence {
	public boolean increasingTriplet(int[] nums) {
		if(nums == null || nums.length == 0) return false;
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			first = Math.min(first, nums[i]);
			if(nums[i] > first) second = Math.min(nums[i], second);
			if(nums[i] > second) return true;
		}
		return false;
	}
}
