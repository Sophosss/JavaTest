package leetcode;

public class FirstMissingPositive {
	public int firstMissingPositive(int[] nums) {
		if (nums == null || nums.length == 0) return 1;
		int n = nums.length;
		for (int i = 0; i < n; ) {
			while (nums[i] <= n && nums [i] > 0 && nums [i] != nums[nums[i] - 1]){
				swap(nums, i, nums [i] - 1);
			}
		}
		for (int i = 0; i < n; i++) {
			if (nums [i] != i + 1)
				return i + 1;
		}
		return n + 1;
	}
	
	public void swap(int [] nums, int i, int j){
		int temp = nums [i];
		nums [i] = nums [j];
		nums [j] = temp;
	}
}
