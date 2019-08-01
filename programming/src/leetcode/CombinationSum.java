package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	List<List<Integer>> list = new ArrayList<>();
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<Integer> list1 = new ArrayList<> ();
		Arrays.sort(candidates);
		back(list1, 0, candidates, target);
		return list;
	}
	public void back(List<Integer> list1, int start, int []arr, int target) {
		if (target == 0){
			list.add(new ArrayList<>(list1));
		}else if (target > 0){
			for (int i = start; i < arr.length; i++) {
				list1.add(arr[i]);
				back(list1, i, arr, target - arr [i]);
				list1.remove(list1.size() - 1);
			}
		}
	}
}
