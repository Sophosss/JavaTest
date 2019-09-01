package leetcode;

public class PerfectSquares {
	public int numSquares(int n) {
		int []dp = new int [n+1];
		dp[0] = 0;
		for(int i = 1; i <= n; i++){
			dp[i] = Integer.MAX_VALUE;
			for(int j = 0; j*j <= i; j++ ){
				if(dp[i - j*j] != Integer.MAX_VALUE){
					dp[i] = Math.min(dp[i], dp[i - j*j] + 1);
				}
			}
		}
		return dp[n];
	}
}
