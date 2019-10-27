package leetcode;

public class ShortestUnsortedContinuousSubarray {
	public int findUnsortedSubarray(int[] nums) {
		int n = nums.length;
		int start = -1;
		int end = -2;
		int max = nums[0];
		int min = nums[n-1];
		for(int i = 0, j = 0; i < n; i++){
			j = n - i - 1;
			max = Math.max(max, nums[i]);
			min = Math.min(min, nums[j]);
			if(nums[i] < max) end = i;
			if(nums[j] > min) start = j;
		}
		return end - start + 1;
	}
}
