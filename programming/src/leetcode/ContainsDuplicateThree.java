package leetcode;

import java.util.TreeSet;

public class ContainsDuplicateThree {
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		if(nums.length == 0 || t < 0) return false;
		TreeSet<Long> set = new TreeSet<>();
		for (int i = 0; i < nums.length; i++) {
			Long tmp = set.ceiling((long)nums[i] - (long)t);
			if(tmp != null && tmp <= (long)nums[i] + (long)t) return true;
			set.add((long)nums[i]);
			if(i >= k) set.remove((long)nums[i-k]);
		}
		return false;
 	}
}
