package leetcodeWeekly;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Two168 {
	public boolean isPossibleDivide(int[] nums, int k) {
		Arrays.sort(nums);
		if(nums.length % k != 0) return false;
		Map<Integer, Integer> map = new HashMap<>();
		for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
		for(int num : nums){
			if(map.containsKey(num) && map.get(num) > 0){
				int tmp = num;
				for (int i = 0; i < k; i++) {
					if(map.containsKey(tmp) && map.get(tmp) > 0){
						map.put(tmp, map.get(tmp) - 1);
						tmp++;
					}
					else return false;
				}
			}
		}
		return true;
	}
}