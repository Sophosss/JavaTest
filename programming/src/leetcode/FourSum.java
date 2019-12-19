package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> list = new ArrayList<>();
		if(nums == null || nums.length < 4) return list;
		Arrays.sort(nums);
		int len = nums.length;
		for (int i = 0; i < len - 3; i++) {
			if(i > 0 && nums[i] == nums[i-1]) continue;
			int min = nums[i] + nums[i+1] + nums[i+2] + nums[i+3];
			if(min > target) break;
			int max = nums[i] + nums[len-1] + nums[len-2] + nums[len-3];
			if(max < target) continue;
			for (int j = i+1; j < len - 2; j++) {
				if(j > i+1 && nums[j] == nums[j-1]) continue;
				int k = j + 1;
				int h = len - 1;
				int min2 = nums[i] + nums[j] + nums[k] + nums[k+1];
				if(min2 > target) break;
				int max2 = nums[i] + nums[j] + nums[h-1] + nums[h];
				if(max2 < target) continue;
				while (k < h){
					int cur = nums[i] + nums[j] + nums[k] + nums[h];
					if(cur == target) {
						list.add(Arrays.asList(nums[i], nums[j], nums[k], nums[h]));
						while (k < h && nums[k] == nums[k+1]) k++;
						k++;
						while (k < h && nums[h] == nums[h-1]) h--;
						h--;
					}
					else if(cur < target) k++;
					else h--;
				}
			}
		}
		return list;
	}
}
