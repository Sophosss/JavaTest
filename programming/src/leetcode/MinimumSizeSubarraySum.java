package leetcode;

import sun.applet.Main;

public class MinimumSizeSubarraySum {
	public int minSubArrayLen(int s, int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		int left = 0;
		int right = 0;
		boolean flag = true;
		int res = Integer.MAX_VALUE;
		int sum = 0;
		while (right < nums.length) {
			sum += nums[right];
			right++;
			while(sum >= s){
				flag = false;
				res = Math.min(res, right - left);
				sum -= nums[left];
				left++;
			}
		}
		return flag ? 0 : res;
	}

	public static void main(String[] args) {
		MinimumSizeSubarraySum sum = new MinimumSizeSubarraySum();
		sum.minSubArrayLen(4, new int[]{1,4,4});
	}
}
