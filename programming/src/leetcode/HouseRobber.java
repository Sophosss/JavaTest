package leetcode;

public class HouseRobber {
	public int rob(int[] nums) {
		if (nums.length == 0) return 0;
		int []arr = new int[nums.length];
		arr[0] = nums [0];
		arr[1] = Math.max(nums [0], nums [1]);
		for (int i = 0; i < nums.length; i++){
			arr[i] = Math.max(arr[i - 1], arr[i - 2] + nums[i]);
		}
		return arr[nums.length - 1];
	}
}
