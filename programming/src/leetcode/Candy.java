package leetcode;

public class Candy {
	public int candy(int[] ratings) {
		if(ratings == null || ratings.length == 0) return 0;
		int[] dp = new int[ratings.length];
		dp[0] = 1;
		for (int i = 1; i < ratings.length; i++) {
			if(ratings[i] > ratings[i-1]) dp[i] = dp[i-1] + 1;
			else dp[i] = 1;
		}
		for (int i = ratings.length-2; i >= 0; i--) {
			if(ratings[i] > ratings[i+1]) dp[i] = Math.max(dp[i], dp[i+1] + 1);
		}
		int res = 0;
		for(int a : dp) res += a;
		return res;
	}

	public static void main(String[] args) {
		Candy candy = new Candy();
		candy.candy(new int[]{1,3,2,2,1});
	}
}
