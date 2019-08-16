package leetcode;

public class KthLargestElementInArray {
	public int findKthLargest(int[] nums, int k) {
		int n = nums.length - 1;
		return partition(nums, 0, n, k);
	}
	private int partition(int [] nums, int start, int end, int k) {
	    int i = start;
	    int j = end;
	    int temp = nums [i];
	    while (i < j){
	    	while (i < j && temp <= nums [j]) {
	    	    j--;
	    	}
	    	swap(nums, i, j);
	    	while (i < j && temp >= nums [i]){
	    		i++;
			}
			swap(nums, i, j);
		}
		if (i == nums.length - k) return temp;
		else if (i > nums.length - k) return partition(nums, start, i - 1, k);
		else return partition(nums, i + 1, end, k);
	}
	private void swap(int [] nums, int i, int j) {
	    int temp = nums [i];
	    nums [i] = nums [j];
	    nums [j] = temp;
	}
}
