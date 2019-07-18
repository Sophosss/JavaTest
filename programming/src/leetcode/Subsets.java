package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Subsets {

	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<>(), nums, 0);
		return list;
	}

	private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
		list.add(new ArrayList<>(tempList));
		for(int i = start; i < nums.length; i++){
			tempList.add(nums[i]);
			backtrack(list, tempList, nums, i + 1);
			tempList.remove(tempList.size() - 1);
		}
	}

	public static void main(String[] args) {
		Subsets subsets = new Subsets();
		int []arr ={1,2,3,4};
		List<List<Integer>> res = subsets.subsets(arr);
		Iterator<List<Integer>> iterator = res.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
