package atcoder;

import java.util.Scanner;

public class F {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String t = in.nextLine();
		System.out.println(check(s, t));
	}
	public static String check(String s, String t){
		if(s.length() == 0 || t.length() == 0) return "";
		int m = s.length();
		int n = t.length();
		int[][] dp = new int[m+1][n+1];
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if(s.charAt(i-1) == t.charAt(j-1)) dp[i][j] = dp[i-1][j-1] + 1;
				else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		int i = m, j = n;
		StringBuilder sb = new StringBuilder();
		while(i >= 1 && j >= 1){
			if(dp[i][j] == dp[i][j-1]) j--;
			else if(dp[i][j] == dp[i-1][j]) i--;
			else {
				sb.append(s.charAt(i-1));
				i--;
				j--;
			}
		}
		return sb.reverse().toString();
	}
}
