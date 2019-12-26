package leetcode;

import java.util.Arrays;

public class CountPrimes {
	public int countPrimes(int n) {
		boolean[] dp = new boolean[n];
		Arrays.fill(dp, true);
		for (int i = 2; i*i < n; i++) {
			if(dp[i]){
				for (int j = i*i; j < n; j+=i) {
					dp[j] = false;
				}
			}
		}
		int c = 0;
		for (int i = 2; i < n; i++) {
			if(dp[i]) c++;
		}
		return c;
	}
}
