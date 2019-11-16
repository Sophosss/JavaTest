package leetcode;

public class MaxPath {
	public static int test(int[][] nums){
		int len = nums.length;
		int max = 0;
		int [][]dp = new int[len][len+1];
		for (int i = 0; i < nums[0].length; i++) {
			dp[len-1][i] = nums[len-1][i];
		}
		for (int i = len-2; i >= 0; i--) {
			for(int j = 0; j < nums[i].length; j++){
				if(j == 0){
					dp[i][j] = Math.max(dp[i+1][j], dp[i+1][j+1]) + nums[i][j];
				}else if(j == nums[i].length - 1){
					dp[i][j] = Math.max(dp[i+1][j], dp[i+1][j-1]) + nums[i][j];
				}else{
					dp[i][j] = Math.max(Math.max(dp[i+1][j], dp[i+1][j+1]), dp[i+1][j-1]) + nums[i][j];
				}
				max = Math.max(max, dp[i][j]);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int [][]nums = new int[][]{{11,2,3},{4,5,6},{17,28,9}};
		System.out.println(test(nums));
	}
}
