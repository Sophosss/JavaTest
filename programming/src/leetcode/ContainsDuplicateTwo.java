package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateTwo {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		if(nums.length == 0 || k == 0) return false;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i]) && (i - map.get(nums[i])) <= k) return true;
			map.put(nums[i], i);
		}
		return false;
	}
}
