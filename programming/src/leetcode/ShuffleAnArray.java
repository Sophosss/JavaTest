package leetcode;

import java.util.Random;

public class ShuffleAnArray {
	int[] arrs;
	int[] arr;
	public ShuffleAnArray(int[] nums) {
		arrs = new int[nums.length];
		this.arr = nums;
		System.arraycopy(nums, 0, arrs, 0, nums.length);
	}

	/** Resets the array to its original configuration and return it. */
	public int[] reset() {
		return arrs;
	}

	/** Returns a random shuffling of the array. */
	public int[] shuffle() {
		Random random = new Random();
		for(int i = arr.length-1; i >= 0; i--){
			swap(arr, 0, random.nextInt(arr.length));
		}
		return arr;
	}
	private void swap(int[] nums, int a, int b){
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
	}
}
