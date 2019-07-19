package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations2 {
		public List<List<Integer>> permuteUnique(int[] nums) {
			List<List<Integer>> list = new ArrayList<>();
			Arrays.sort(nums); // not necessary
			backtrack(list, new ArrayList<>(), nums, new boolean[nums.length]);
			return list;
		}

		private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, boolean[] used){
			if(tempList.size() == nums.length){
				list.add(new ArrayList<>(tempList));
			} else{
				for(int i = 0; i < nums.length; i++){
					if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) continue;
					used[i] = true;
					tempList.add(nums[i]);
					backtrack(list, tempList, nums, used);
					used[i] = false;
					tempList.remove(tempList.size() - 1);
				}
			}
		}
		public static void main(String[] args) {
			Permutations2 permutations2 = new Permutations2();
			int []arr ={1,2,2,2};
			List<List<Integer>> res = permutations2.permuteUnique(arr);
			for (List<Integer> re : res) {
				System.out.println(re);
			}
		}
	}
