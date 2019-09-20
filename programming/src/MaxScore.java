import java.util.LinkedList;
import java.util.List;

import	java.util.ArrayDeque;
import	java.util.Deque;
public class MaxScore {
	//a12b56c1
	public static int maxPathSum(List<List<Integer>> board, int p, int q) {
		// Write your code here
		int len1 = board.size();
		int len2 = board.get(0).size();
		int max = 0;
		Deque<Integer> queue = new LinkedList<>();
		int [][]nums = new int[len1][len2];
		int [][]dp = new int [len1][len2];
		int [][]dp2 = new int [len1][len2];
		for (List<Integer> list : board){
			queue.addAll(list);
		}
		for (int i = 0; i < len1; i++) {
			for (int j = 0; j < len2; j++) {
				nums[i][j] = queue.poll();
			}
		}
		for (int i = 0; i < len2; i++) {
			dp[0][i] = nums[0][i];
		}
		for (int i = 1; i < len1; i++) {
			for (int j = 0; j < len2; j++) {
				if(j == 0){
					dp[i][j] = nums[i][j] + Math.max(dp[i-1][j], dp[i-1][j+1]);
				}else if(j == len2 - 1){
					dp[i][j] = nums[i][j] + Math.max(dp[i-1][j], dp[i-1][j-1]);
				}else {
					dp[i][j] = nums[i][j] + Math.max(dp[i-1][j], Math.max(dp[i-1][j+1], dp[i-1][j-1]));
				}
				max = Math.max(max, dp[i][j]);
			}
		}
		for (int i = 0; i < len2; i++) {
			dp2[len1-1][i] = nums[len1-1][i];
		}
		for (int i = len1-2; i >=0; i--) {
			for (int j = 0; j < len2; j++) {
				if(j == 0){
					dp2[i][j] = nums[i][j] + Math.max(dp2[i+1][j], dp2[i+1][j+1]);
				}else if(j == len2 - 1){
					dp2[i][j] = nums[i][j] + Math.max(dp2[i+1][j], dp2[i+1][j-1]);
				}else {
					dp2[i][j] = nums[i][j] + Math.max(dp2[i+1][j], Math.max(dp2[i+1][j+1], dp2[i+1][j-1]));
				}
				max = Math.max(max, dp2[i][j]);
			}
		}

		return p == 0 ? dp2[p][q] : dp[p][q];
	}
}
