package leetcode;

public class MaximumLengthOfRepeatedSubarray {
	public int findLength(int[] A, int[] B) {
		int len1 = A.length;
		int len2 = B.length;
		int res = 0;
		int [][]dp = new int[len1+1][len2+1];
		for(int i = 1; i <= len1; i++){
			for(int j = 1; j <= len2; j++){
				if(A[i-1] == B[j-1]) dp[i][j] = dp[i-1][j-1] + 1;
				res = Math.max(res, dp[i][j]);
			}
		}
		return res;
	}
}
