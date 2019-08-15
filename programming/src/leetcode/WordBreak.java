package leetcode;

import java.util.List;

public class WordBreak {
	public boolean wordBreak(String s, List<String> wordDict) {
		if (wordDict == null || wordDict.isEmpty()) return true;
		int n = s.length();
		boolean []dp = new boolean[n+1];
		dp[0] = true;
		for (int i = 1; i <= n; i++) {
			for (int j = i - 1; j >= 0 ; j--) {
				if (dp[j] && wordDict.contains(s.substring(j,i))){
					dp[i] = true;
					break;
				}
			}
		}
		return dp[n];
	}
}
