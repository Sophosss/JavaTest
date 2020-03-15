package atcoder;

import java.util.Scanner;

public class H {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int[][] nums = new int[m][n], dp = new int[m][n];
		for (int i = 0; i < m; i++) {
			String s = in.next();
			for (int j = 0; j < n; j++) {
				nums[i][j] = '#' == s.charAt(j) ? 1 : 0;
			}
		}
		dp[0][0] = 1;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(i > 0 && j == 0){
					if(nums[i][j] == 0) dp[i][0] = dp[i-1][0];
				}else if(j > 0 && i == 0){
					if(nums[i][j] == 0) dp[0][j] = dp[0][j-1];
				}else if(i > 0){
					if(nums[i][j] == 0) dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 1000000007;
				}
			}
		}
		System.out.println(dp[m - 1][n - 1]);
	}
}
