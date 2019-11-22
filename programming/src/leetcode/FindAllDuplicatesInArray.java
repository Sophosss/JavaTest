package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {
	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> list = new ArrayList<>();
		if(nums == null || nums.length == 0) return list;
		for(int i = 0; i < nums.length; i++){
			while(nums[i] != nums[nums[i] - 1]) swap(nums, i, nums[i] - 1);
		}
		for(int j = 0; j < nums.length; j++){
			if(nums[j] != j + 1) list.add(nums[j]);
		}
		return list;
	}
	public void swap(int []nums, int i, int j){
		nums[i] = nums[i] ^ nums[j];
		nums[j] = nums[i] ^ nums[j];
		nums[i] = nums[i] ^ nums[j];
	}
}
