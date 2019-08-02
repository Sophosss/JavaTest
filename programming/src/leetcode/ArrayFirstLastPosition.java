package leetcode;

public class ArrayFirstLastPosition {
	public int[] searchRange(int[] nums, int target) {
		if (nums == null || nums.length == 0) return new int[]{-1,-1};
		int left = 0;
		int right = nums.length - 1;
		int a = first(nums, left, right, target);
		if (nums [a] != target){
			return new int[]{-1,-1};
		}
		int b = last(nums, left, right, target);
		return new int[]{a, b};
	}
	public int first(int [] nums, int left, int right, int target){
		while (left < right){
			int mid = (left + right) >>> 1;
			if (nums [mid] < target){
				left = mid + 1;
			}else right = mid;
		}
		return left;
	}
	public int last(int [] nums, int left, int right, int target){
		while (left < right){
			int mid = (left + right + 1) >>> 1;
			if (nums [mid] > target){
				right = mid - 1;
			}else left = mid;
		}
		return right;
	}
}
