package leetcode;

public class BestTimeBuySellStock {
	public int maxProfit(int[] prices) {
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for (int i = 0; i < prices.length; i++){
			if (prices [i] < min){
				min = prices [i];
			}
			else if (prices [i] - min > sum){
				sum = prices [i] - min;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		BestTimeBuySellStock btbss = new BestTimeBuySellStock();
		int[] arr = {2,7,1,4};
		int a = btbss.maxProfit(arr);
		System.out.println(a);
	}
}
