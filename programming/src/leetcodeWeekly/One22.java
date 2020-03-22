package leetcodeWeekly;

import java.util.Arrays;

public class One22 {
	public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
		Arrays.sort(arr1);
		int cnt = 0;
		for (int i = 0; i < arr1.length; i++) {
			boolean flag = true;
			for (int j = 0; j < arr2.length; j++) {
				if(Math.abs(arr1[i] - arr2 [j]) <= d) flag = false;
			}
			cnt += flag ? 1 : 0;
		}
		return cnt;
	}
}
