package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNum {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<>();
		if (nums == null || nums.length == 0) return list;
		for (int i = 0; i < nums.length;i++) {
			while (nums[i] != i + 1 && nums[i] != nums[nums[i] - 1]) {
				swap(nums, i, nums[i] - 1);
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums [i] != i + 1) list.add(i + 1);
		}
		return list;
	}

	public void swap(int [] nums, int i, int j){
		int temp = nums [i];
		nums [i] = nums [j];
		nums [j] = temp;
	}


	public static void main(String[] args) {
		int []nums = {4,3,2,7,8,2,3,1};
		FindDisappearedNum findDisappearedNum = new FindDisappearedNum();
		findDisappearedNum.findDisappearedNumbers(nums);
	}
}
