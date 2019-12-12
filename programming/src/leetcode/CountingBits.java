package leetcode;

public class CountingBits {
	public int[] countBits(int num) {
		int[] dp = new int[num+1];
		for(int i = 0; i <= num; i++) dp[i] = go(i);
		return dp;
	}
	public int go(int i){
		int c = 0;
		while(i != 0) {
			i = i & (i-1);
			c++;
		}
		return c;
	}
}
