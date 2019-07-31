package leetcode;

public class HouseRobberTwo {
	public int rob(int[] nums) {
		if (nums == null || nums.length == 0) return 0;
		if (nums.length == 1) return nums [0];
		if (nums.length == 2) return Math.max(nums [0], nums [1]);
		int n = nums.length;
		int []arr1 = new int [n-1];
		int []arr2 = new int [n-1];
		System.arraycopy(nums, 1, arr1, 0,n-1);
		System.arraycopy(nums, 0, arr2, 0,n-1);
		int sum1 = test(new int[arr1.length], arr1);
		int sum2 = test(new int[arr2.length], arr2);
		return sum1 > sum2 ? sum1 : sum2;
	}
	public int test(int [] nums, int [] arr){
		nums[0] = arr [0];
		nums[1] = Math.max(arr [0], arr [1]);
		for (int i = 2; i < arr.length; i++) {
			nums [i] = Math.max(nums [i-1], nums [i-2] + arr [i]);
		}
		return nums [arr.length - 1];
	}
}
