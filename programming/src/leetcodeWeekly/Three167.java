package leetcodeWeekly;

public class Three167 {
	int[][] a = new int [310][310];
	int[][] dp = new int [310][310];
	public int maxSideLength(int[][] mat, int threshold) {
		int m = mat.length;
		int n = mat[0].length;
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + mat[i-1][j-1];
			}
		}
		int ans = 0;
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= Math.min(m, n); k++) {
					if(i+k-1 <= m && j+k-1 <= n){
						int ar = i+k-1, ac = j+k-1, br = i-1, bc = j-1;
						int sum = dp[ar][ac] + dp[br][bc] - dp[ar][bc] - dp[br][ac];
						if(sum <= threshold) ans = Math.max(ans, k);
					}
				}
			}
		}
		return ans;
	}
}
