package leetcodeWeekly;

public class Four15 {
	public int minFallingPathSum(int[][] arr) {
		int[][] dp = new int[arr.length][arr[0].length];
		for (int i = 0; i < arr[0].length; i++) dp[0][i] = arr[0][i];
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				int min = Integer.MAX_VALUE;
				for (int k = 0; k < arr[0].length; k++) {
					if(k != j) min = Math.min(min, dp[i-1][k]);
				}
				dp[i][j] = arr[i][j] + min;
			}
		}
		int min = Integer.MAX_VALUE;
		for(int a : dp[dp.length - 1]) min = Math.min(min, a);
		return min;
	}
}
