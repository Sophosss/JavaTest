package leetcode;

public class MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
		int res = -1;
		int max = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] == 0){
				max = Math.max(max, i - res - 1);
				res = i;
			}
		}
		return res == -1 ? nums.length : Math.max(max, nums.length - res - 1);
	}
}
