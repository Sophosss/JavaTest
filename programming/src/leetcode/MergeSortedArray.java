package leetcode;

import java.util.Arrays;

public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int len = m + n - 1;
		int len1 = m - 1;
		int len2 = n - 1;
		while (len1 >= 0 && len2 >= 0){
			nums1 [len--] = nums1[len1] > nums2 [len2] ? nums1 [len1--] : nums2 [len2--];
		}
		System.arraycopy(nums2, 0, nums1, 0, len2 + 1);
	}

	public static void main(String[] args) {
		MergeSortedArray mergeSortedArray = new MergeSortedArray();
		int [] nums = {2,0};
		int [] nums1 = {1};
		mergeSortedArray.merge(nums, 1, nums1, 1);

	}
}
