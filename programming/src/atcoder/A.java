package atcoder;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] nums = new int[n], dp = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = in.nextInt();
		}
		dp[1] = Math.abs(nums[0] - nums[1]);
		for (int i = 2; i < n; i++) {
			dp[i] = Math.min(dp[i-2] + Math.abs(nums[i] - nums[i-2]), dp[i-1] + Math.abs(nums[i] - nums[i-1]));
		}
		System.out.println(dp[n - 1]);
	}
}
