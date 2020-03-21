package newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPattern {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String p = bf.readLine();
		String t = bf.readLine();
		int res = go(t ,p) ? 1 : 0;
		System.out.println(res);
	}
	public static boolean go(String t, String p){
		boolean[][] dp = new boolean [t.length()+1][p.length()+1];
		dp[0][0] = true;
		for (int i = 1; i <= p.length(); i++) {
			if(p.charAt(i-1) == '*') dp[0][i] = dp[0][i-1];
		}
		for (int i = 1; i <= t.length(); i++) {
			for (int j = 1; j <= p.length(); j++) {
				if(t.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?') dp[i][j] = dp[i-1][j-1];
				else if(p.charAt(j-1) == '*') dp[i][j] = dp[i-1][j] || dp[i][j-1];
			}
		}
		return dp[t.length()][p.length()];
	}
}
