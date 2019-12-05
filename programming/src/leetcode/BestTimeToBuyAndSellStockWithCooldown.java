package leetcode;

public class BestTimeToBuyAndSellStockWithCooldown {
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0) return 0;
		int[][] dp = new int[prices.length][3];
		dp[0][1] = -prices[0];
		//dp[][0] 卖出后
		//dp[][1] 买入后
		//dp[][2] 冷冻期
		for (int i = 1; i < prices.length; i++) {
			dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
			dp[i][1] = Math.max(dp[i-1][2] - prices[i], dp[i-1][1]);
			dp[i][2] = Math.max(dp[i-1][0], dp[i-1][2]);
		}
		return Math.max(dp[prices.length-1][0], dp[prices.length-1][2]);
	}

	public static void main(String[] args) {
		BestTimeToBuyAndSellStockWithCooldown b = new BestTimeToBuyAndSellStockWithCooldown();
		b.maxProfit(new int[]{1,2,3,0,2});
	}
}
