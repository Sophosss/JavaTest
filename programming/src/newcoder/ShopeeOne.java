package newcoder;

import java.util.Scanner;

public class ShopeeOne {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] s1 = in.nextLine().split(" ");
		int x = Integer.parseInt(s1[0]);
		int y = Integer.parseInt(s1[1]);
		int n = Integer.parseInt(s1[2]);
		long[][] dp = new long[x+1][y+1];
		for (int i = 0; i < n; i++) {
			String[] s2 = in.nextLine().split(" ");
			dp[Integer.parseInt(s2[0])][Integer.parseInt(s2[1])] = 1;
		}
		for (int i = 0; i <= x; i++) {
			for (int j = 0; j <= y; j++) {
				if(i == 0 && j == 0) dp[i][j] = 1;
				else if(i == 0 && j != 0){
					if(dp[i][j] == 1) dp[i][j] = 0;
					else dp[i][j] = dp[i][j-1];
				}else if(i != 0 && j == 0){
					if(dp[i][j] == 1) dp[i][j] = 0;
					else dp[i][j] = dp[i-1][j];
				}else{
					if(dp[i][j] == 1) dp[i][j] = 0;
					else dp[i][j] = dp[i-1][j] + dp[i][j-1];
				}
			}
		}
		System.out.println(dp[x][y]);
	}
}
