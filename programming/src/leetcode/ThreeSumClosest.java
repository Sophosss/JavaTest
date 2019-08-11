package leetcode;

import java.util.Arrays;

public class ThreeSumClosest {
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int start= 0, end = 0, num = 0;
		int temp = nums [0] + nums [1] + nums [2];
		for (int i = 0; i < nums.length - 1; i++) {
			start = i + 1;
			end = nums.length - 1;
			while (start < end){
				num = nums [i] + nums [start] + nums [end];
				if (Math.abs(num - target) < Math.abs(temp - target)) temp = num;
				else {
					if (num > target) end--;
					else start++;
				}
			}
		}
		return temp;
	}
}
