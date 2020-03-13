package atcoder;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] nums = new int[n], dp = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = in.nextInt();
		}
		dp[1] = Math.abs(nums[0] - nums[1]);
		for (int i = 2; i < n; i++) {
			dp[i] = Integer.MAX_VALUE;
			for (int j = 1; j <= k; j++) {
				if(i - j >= 0){
					dp[i] = Math.min(dp[i], dp[i-j] + Math.abs(nums[i] - nums[i-j]));
				}
			}
		}
		System.out.println(dp[n - 1]);
	}
}
