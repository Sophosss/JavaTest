package leetcode;

public class GuessNumberHigherOrLowerTwo {
	public int getMoneyAmount(int n) {
		int[][] dp = new int[n+2][n+2];
		for(int i = n; i >= 1; --i) {
			for(int j = i; j <= n; ++j) {
				if(i == j)
					dp[i][j] = 0;
				else {
					dp[i][j] = Integer.MAX_VALUE;
					for(int x = i; x <= j; ++x)
						dp[i][j] = Math.min(dp[i][j], Math.max(dp[i][x-1], dp[x+1][j]) + x);
				}
			}
		}
		return dp[1][n];375. 猜数字大小 II
	}
}
