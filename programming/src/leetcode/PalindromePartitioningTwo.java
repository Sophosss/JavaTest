package leetcode;

public class PalindromePartitioningTwo {
	public int minCut(String s) {
		if(s == null || s.length() == 0) return 0;
		int[] dp = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			if(ok(s, 0, i)) dp[i] = 0;
			else dp[i] = dp[i-1] + 1;
		}
		for (int i = 1; i < s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if(ok(s, j+1, i)) dp[i] = Math.min(dp[i], dp[j] + 1);
			}
		}
		return dp[s.length()-1];
	}
	private boolean ok(String s, int a, int b){
		while (a++ < b--){
			if(s.charAt(a) != s.charAt(b)) return false;
		}
		return true;
	}
}
