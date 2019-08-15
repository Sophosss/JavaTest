package leetcode;

public class MaximumProductSubarray {
	public int maxProduct(int[] nums) {
		int res = nums [0];
		int max = res;
		int min = res;
		int temp = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > 0){
				max = Math.max(max * nums[i], nums [i]);
				min = Math.min(min * nums[i], nums [i]);
			}else {
				temp = max;
				max = Math.max(min * nums[i], nums [i]);
				min = Math.min(temp * nums[i], nums [i]);
			}
			res = Math.max(res, max);
		}
		return res;
	}
}
