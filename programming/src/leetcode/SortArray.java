package leetcode;

public class SortArray {
	public int[] sortArray(int[] nums) {
		if (nums == null || nums.length < 2) return nums;
		partition(nums, 0, nums.length-1);
		return nums;
	}
	private void partition(int [] nums, int start, int end) {
	    if (end - start < 1) return;
	    int index = partitionSort(nums, start, end);
	    partition(nums, start, index-1);
	    partition(nums, index+1, end);
	}
	private int partitionSort(int [] nums, int start, int end){
		int temp = nums [start];
		while (start < end){
			while (start < end && nums [end] >= temp){
				end--;
			}
			swap(nums, start, end);
			while (start < end && nums [start] <= temp){
				start++;
			}
			swap(nums, start, end);
		}
		nums [start] = temp;
		return start;
	}
	private void swap(int [] nums, int i, int j) {
	    int temp = nums [i];
	    nums [i] = nums [j];
	    nums [j] = temp;
	}
}
