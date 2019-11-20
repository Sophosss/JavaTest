package leetcode;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElementsTwo {
	public int minMoves2(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		Arrays.sort(nums);
		int sum = 0;
		int i = 0;
		int j = nums.length - 1;
		while(i < j){
			sum += nums[j--] - nums[i++];
		}
		return sum;
	}
}
