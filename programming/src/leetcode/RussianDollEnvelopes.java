package leetcode;

import java.util.Arrays;

public class RussianDollEnvelopes {
	public int maxEnvelopes(int[][] envelopes) {
		if(envelopes == null || envelopes.length == 0) return 0;
		int len = envelopes.length;
		int []nums = new int[len];
		Arrays.sort(envelopes, (o1, o2) -> o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0]);
		Arrays.fill(nums, 1);
		int max = 1;
		for(int i = 1; i < len; i++){
			for(int j = 0; j < i; j++){
				if(envelopes[j][1] < envelopes[i][1]) {
					nums[i] = Math.max(nums[i], nums[j] + 1);
					max = Math.max(max, nums[i]);
				}
			}
		}
		return max;
	}
}
