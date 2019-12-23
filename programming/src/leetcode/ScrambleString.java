package leetcode;

public class ScrambleString {
	public boolean isScramble(String s1, String s2) {
		if(s1 == null || s2 == null || s1.length() == 0 || s2.length() == 0 || s1.length() != s2.length()) return false;
		boolean[][][] dp = new boolean[s1.length()+1][s1.length()][s2.length()];
		for (int l = 1; l <= s1.length(); l++) {
			for (int i = 0; i <= s1.length() - l; i++) {
				for (int j = 0; j <= s2.length() - l; j++) {
					if(l == 1) dp[l][i][j] = s1.charAt(i) == s2.charAt(j);
					else{
						for (int k = 1; k < l; k++) {
							dp[l][i][j] = dp[k][i][j] && dp[l-k][i+k][j+k] || dp[k][i][j+l-k] && dp[l-k][i+k][j];
							if(dp[l][i][j]) break;
						}
					}
				}
			}
		}
		return dp[s1.length()][0][0];
	}
}
