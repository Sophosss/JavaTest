package leetcode;

public class RotateArray {
	public void rotate(int[] nums, int k) {
		if(nums == null || nums.length == 0 || k == 0) return;
		int index = nums.length - k % nums.length - 1;
		reverse(nums, 0, index);
		reverse(nums, index + 1, nums.length - 1);
		reverse(nums, 0, nums.length - 1);
	}
	private void reverse(int[] nums, int l , int r){
		while(l < r){
			int tmp = nums[l];
			nums[l] = nums[r];
			nums[r] = tmp;
			l++;
			r--;
		}
	}

	public static void main(String[] args) {
		RotateArray rotateArray = new RotateArray();
		rotateArray.rotate(new int[]{1,2,3,4,5,6,7}, 3);
	}
}
