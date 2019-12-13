package leetcode;

public class RemoveDuplicatesFromSortedArrayTwo {
	public int removeDuplicates(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		int index = 0;
		for(int num : nums){
			if(index < 2 || num > nums[index - 2]) nums[index++] = num;
		}
		return index;
	}
}
