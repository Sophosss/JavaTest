package leetcodeWeekly;

public class Three165 {
	public static int maximalSquare(int[][] matrix) {
		if(matrix == null || matrix.length == 0) return 0;
		int len1 = matrix.length;
		int len2 = matrix[0].length;
		int [][]dp = new int [len1+1][len2+1];
		int max = 0;
		for(int i = 1; i <= len1; i++){
			for(int j = 1;j <= len2; j++){
				if(matrix[i-1][j-1] == 1) {
					dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1])) + 1;
					max = max > dp[i][j] ? max : dp[i][j];
				}
			}
		}
		int []arrs = new int[max+1];
		for (int i = 1; i <= len1; i++) {
			for (int j = 1; j <= len2 ; j++) {
				arrs[dp[i][j]]++;
			}
		}
		int sum = 0;
		int mul = 0;
		for(int i = arrs.length - 1; i >= 1; i--){
			mul += arrs[i];
			sum += mul;
		}
		return sum;
	}

	public static void main(String[] args) {
		int[][] nums = new int[][]{{0,1,1,1},{1,1,1,1},{0,1,1,1}};
		System.out.println(Three165.maximalSquare(nums));
	}
}
