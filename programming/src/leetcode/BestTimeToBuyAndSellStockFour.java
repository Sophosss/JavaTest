package leetcode;

public class BestTimeToBuyAndSellStockFour {
	public int maxProfit(int k, int[] prices) {
		if(prices == null || prices.length == 0) return 0;
		if(k > prices.length / 2){
			int[][] dp = new int[prices.length][2];
			dp[0][1] = -prices[0];
			for (int i = 1; i < prices.length; i++) {
				dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
				dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
			}
			return dp[prices.length-1][0];
		}
		int[][][] dp = new int[prices.length][k+1][2];
		for(int i = 0; i < k; i++) dp[0][i][1] = -prices[0];
		for (int i = 1; i < prices.length; i++) {
			for (int j = k; j >= 1; j--) {
				dp[i][j][0] = Math.max(dp[i-1][j][0], dp[i-1][j][1] + prices[i]);
				dp[i][j][1] = Math.max(dp[i-1][j][1], dp[i-1][j-1][0] - prices[i]);
			}
		}
		return dp[prices.length-1][k][0];
	}
}
