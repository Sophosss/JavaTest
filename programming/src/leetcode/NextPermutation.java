package leetcode;

import java.util.Arrays;

public class NextPermutation {
	public void nextPermutation(int[] nums) {
		if (nums.length == 1) return;
		int n = nums.length;
		int temp= nums [n-1];
		int start = 0;
		int end = 0;
		int a = 0;
		for (int i = n-2; i >= 0; i--) {
			if (nums[i] < temp){
				start = i;
				a = nums [i];
				break;
			}else temp = nums [i];
		}
		for (int i = start; i < n; i++){
			if (nums [i] > a){
				end = i;
			}
		}
		int tem = nums [start];
		nums [start] = nums [end];
		nums [end] = tem;
		Arrays.sort(nums, start + 1, n);
	}

	public static void main(String[] args) {
		int []arr = {1,2};
		NextPermutation np = new NextPermutation();
		np.nextPermutation(arr);
		System.out.println(Arrays.toString(arr));
	}
}
