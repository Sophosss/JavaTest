package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		int left, right,sum;
		for (int i = 0; i < nums.length; i++){
			if (nums [i] > 0) break;
			if (i > 0 && nums [i] == nums [i-1]) continue;
			left = i + 1;
			right = nums.length - 1;
			while (left < right){
				sum = nums [left] + nums [right] + nums [i];
				if (sum == 0){
					list.add(Arrays.asList(nums [i], nums [left], nums [right]));
					while (left < right && nums [left] == nums [left + 1]) left++;
					while (left < right && nums [right] == nums [right - 1]) right--;
					left++;
					right--;
				}
				else if (sum < 0) left++;
				else right--;
			}
		}
		return list;
	}
}
