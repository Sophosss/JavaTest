package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsNoDup {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		back(nums, list, new ArrayList<>(), 0);
		return list;
	}
	private void back(int[] nums, List<List<Integer>> list, List<Integer> list1, int start){
		list.add(new ArrayList<>(list1));
		for (int i = start; i < nums.length; i++) {
			list1.add(nums[i]);
			back(nums, list, list1, i+1);
			list1.remove(list1.size()-1);
		}
	}
}