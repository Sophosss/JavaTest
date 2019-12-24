package leetcode;

public class RangeSumQuery2DImmutable {
	int[][] dp;
	public RangeSumQuery2DImmutable(int[][] matrix) {
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
		dp = new int[matrix.length+1][matrix[0].length+1];
		dp[1][1] = matrix[0][0];
		for (int i = 1; i <= matrix.length; i++) {
			for (int j = 1; j <= matrix[0].length; j++) {
				if(i == 1 && j > 1) dp[i][j] = dp[i][j-1] + matrix[i-1][j-1];
				else if(j == 1 && i > 1) dp[i][j] = dp[i-1][j] + matrix[i-1][j-1];
				else dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1];
			}
		}
	}
	public int sumRegion(int row1, int col1, int row2, int col2) {
		if(dp == null || dp.length == 0) return 0;
		else return dp[row2][col2] - dp[row2][col1] - dp[row1][col2] + dp[row1][col1];
	}
}
