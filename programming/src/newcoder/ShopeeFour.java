package newcoder;
import java.util.ArrayList;
import java.util.List;
import	java.util.Scanner;

public class ShopeeFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] dp = new int[n][n];
		List<int[]> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				dp[i][j] = in.nextInt();
				if(dp[i][j] == 1) list.add(new int[]{i, j});
			}
		}
		int res = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(dp[i][j] == 0){
					int tmp = 0;
					for(int[] t : list) tmp += Math.abs(i-t[0]) + Math.abs(j-t[1]);
					res = Math.min(res, tmp);
				}
			}
		}
		System.out.println(res == Integer.MAX_VALUE ? -1 : res);
	}
}
