package leetcode;

import java.util.Arrays;

public class OnesAndZeroes {
	public int findMaxForm(String[] strs, int m, int n) {
		if(strs == null || strs.length == 0) return 0;
		int len = strs.length;
		int []ms = new int[len];
		int []ns = new int[len];
		int []v = new int[len];
		int [][][]dp = new int[len][m+1][n+1];
		Arrays.fill(v, 1);
		for(int i = 0; i < strs.length; i++){
			int zeros = 0, ones = 0;
			for(int j = 0; j < strs[i].length(); j++){
				if(strs[i].charAt(j) == '0') zeros++;
				else ones++;
			}
			ms[i] = zeros;
			ns[i] = ones;
		}
		for(int i = 0; i <= m; i++){
			for(int j = 0; j <= n; j++){
				if(i >= ms[0] && j >= ns[0]) dp[0][i][j] = v[0];
			}
		}
		for(int i = 1; i < len; i++){
			for(int j = 0; j <= m; j++){
				for(int k = 0; k <= n; k++){
					dp[i][j][k] = dp[i-1][j][k];
					if(j >= ms[i] && k >= ns[i]) dp[i][j][k] = Math.max(dp[i][j][k], dp[i-1][j-ms[i]][k-ns[i]] + v[i]);
				}
			}
		}
		return dp[len-1][m][n];
	}
}
