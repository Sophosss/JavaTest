package atcoder;

import java.util.Arrays;
import java.util.Scanner;

public class E {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int W = in.nextInt();
		int[] w = new int[n];
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			w[i] = in.nextInt();
			p[i] = in.nextInt();
		}
		//前n个物品能得到j价值的最小重量
		long[]dp = new long[100001];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 100000; j >= p[i]; j--) {
				dp[j] = Math.min(dp[j], dp[j-p[i]] + w[i]);
			}
		}
		for(int i = 100000; i >= 0; i--){
			if(dp[i] <= W){
				System.out.println(i);
				return;
			}
		}
	}
}
