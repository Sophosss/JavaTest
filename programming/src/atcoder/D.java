package atcoder;

import java.util.Scanner;

public class D {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int W = in.nextInt();
		int[] w = new int[n];
		long[] p = new long[n];
		for (int i = 0; i < n; i++) {
			w[i] = in.nextInt();
			p[i] = in.nextLong();
		}
		long[][]dp = new long[n][W+1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= W; j++) {
				if(i == 0){
					if(j >= w[i]) dp[i][j] = p[i];
				}else{
					dp[i][j] = dp[i-1][j];
					if(j >= w[i]) dp[i][j] = Math.max(dp[i][j], dp[i-1][j-w[i]] + p[i]);
				}
			}
		}
		System.out.println(dp[n - 1][W]);
	}
}
