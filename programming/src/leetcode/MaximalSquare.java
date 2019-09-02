package leetcode;

public class MaximalSquare {
	public int maximalSquare(char[][] matrix) {
		if(matrix == null || matrix.length == 0) return 0;
		int len1 = matrix.length;
		int len2 = matrix[0].length;
		int [][]dp = new int [len1+1][len2+1];
		int max = 0;
		for(int i = 1; i <= len1; i++){
			for(int j = 1;j <= len2; j++){
				if(matrix[i-1][j-1] == '1') {
					dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1])) + 1;
					max = max > dp[i][j] ? max : dp[i][j];
				}
			}
		}
		return max*max;
	}
}
