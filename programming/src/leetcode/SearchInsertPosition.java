package leetcode;

import java.util.Arrays;

public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		int temp = Arrays.binarySearch(nums, target);
		return temp >= 0 ? temp : -temp - 1;
	}
}
