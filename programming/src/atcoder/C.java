package atcoder;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] dp = new int[n][3];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				dp[i][j] = in.nextInt();
			}
		}
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				if(j == 0) dp[i][j] += Math.max(dp[i-1][j+1], dp[i-1][j+2]);
				else if(j == 2) dp[i][j] += Math.max(dp[i-1][j-1], dp[i-1][j-2]);
				else dp[i][j] += Math.max(dp[i-1][j-1], dp[i-1][j+1]);
			}
		}
		System.out.println(Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2])));
	}
}
