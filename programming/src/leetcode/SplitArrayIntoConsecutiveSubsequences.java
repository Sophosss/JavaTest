package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SplitArrayIntoConsecutiveSubsequences {
	public boolean isPossible(int[] nums) {
		Map<Integer, Integer> c = new HashMap<>(16);
		Map<Integer, Integer> e = new HashMap<>(16);
		for(int num : nums) c.put(num, c.getOrDefault(num, 0) + 1);
		for(int num : nums){
			if(c.get(num) == 0) continue;
			c.put(num, c.get(num) - 1);
			if(e.containsKey(num-1) && e.get(num-1) > 0){
				e.put(num-1, e.get(num-1) - 1);
				e.put(num, e.getOrDefault(num, 0) + 1);
			}
			else if(c.containsKey(num+1) && c.containsKey(num+2) && c.get(num+1) > 0 && c.get(num+2) > 0){
				c.put(num+1, c.get(num+1) - 1);
				c.put(num+2, c.get(num+2) - 1);
				e.put(num+2, e.getOrDefault(num+2, 0) + 1);
			}
			else return false;
		}
		return true;
	}
}
