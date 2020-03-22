package leetcodeWeekly;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Two181 {
	public int sumFourDivisors(int[] nums) {
		int[] cnts = new int[nums.length];
		int max = 0;
		Map<Integer, List<Integer>> map = new HashMap<>();
		for(int num : nums) max = Math.max(max, num);
		for (int i = 1; i*i <= max ; i++) {
			for (int j = 0; j < nums.length; j++) {
				if(i*i > nums[j] || cnts[j] == -1) continue;
				if(nums[j] % i == 0) {
					if(i * i == nums[j]) cnts[j]++;
					else cnts[j] += 2;
					List<Integer> list = new ArrayList<>();
					if(map.containsKey(j)){
						map.get(j).add(i);
						map.get(j).add(nums[j] / i);
					}else{
						list.add(i);
						list.add(nums[j] / i);
						map.put(j, list);
					}
				}
				if(cnts[j] > 4) {
					map.get(j).clear();
					cnts[j] = -1;
				}
			}
		}
		int c = 0;
		for (int i = 0; i < nums.length; i++) {
			if(cnts[i] == 4){
				for(int a : map.get(i)) c += a;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		Two181 two181 = new Two181();
		two181.sumFourDivisors(new int[]{1,2,3,4,5});
	}
}
