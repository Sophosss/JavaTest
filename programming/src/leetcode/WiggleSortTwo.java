package leetcode;

import java.util.Arrays;

public class WiggleSortTwo {
	public void wiggleSort(int[] nums) {
		if(nums == null || nums.length == 0) return;
		int len = nums.length;
		int[] small = len % 2 == 0 ? new int[len/2] : new int[len/2+1];
		int[] big = new int[len/2];
		Arrays.sort(nums);
		System.arraycopy(nums, 0, small, 0, small.length);
		System.arraycopy(nums, small.length, big, 0, big.length);
		int i = 0;
		for(; i < big.length; i++){
			nums[i*2] = small[small.length-i-1];
			nums[i*2+1] = big[big.length-i-1];
		}
		if(len % 2 != 0) nums[i*2] = small[small.length-i-1];
	}
}
