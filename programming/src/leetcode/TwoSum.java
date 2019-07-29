package leetcode;

import java.util.HashMap;

public class TwoSum {
	HashMap<Integer,Integer> hashMap = new HashMap<>();
	int []arr = new int[2];
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (hashMap.containsKey(target - nums[i])){
				hashMap.put(nums[i],i);
			}else {
				arr[0] = hashMap.get(target - nums[i]);
				arr[1] = i;
				break;
			}
		}
		return arr;
	}
}
