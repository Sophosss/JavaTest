package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FourSumTwo {
	public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
		Map<Integer, Integer> map = new HashMap<>();
		int key = 0;
		int res = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				key = A[i] + B[j];
				map.put(key, map.getOrDefault(key, 0) + 1);
			}
		}
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < D.length; j++) {
				key = C[i] + D[j];
				if(map.containsKey(-key)) res += map.get(-key);
			}
		}
		return res;
 	}
}
