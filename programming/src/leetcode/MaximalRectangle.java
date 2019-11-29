package leetcode;

import java.util.Stack;

public class MaximalRectangle {
	public int maximalRectangle(char[][] matrix) {
		if(matrix == null || matrix.length == 0) return 0;
		int max = 0;
		int []dp = new int [matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				dp[j] = matrix[i][j] == '0' ? 0 : dp[j] + 1;
			}
			max = Math.max(max, largestRectangleArea(dp));
		}
		return max;
	}
	public int largestRectangleArea(int[] heights) {
		if(heights == null || heights.length == 0) return 0;
		Stack<Integer> stack = new Stack<>();
		int max = 0;
		int len = heights.length;
		for(int i = 0; i < heights.length; i++){
			while(!stack.isEmpty() && heights [i] <= heights [stack.peek()]){
				int j = stack.pop();
				int k = stack.isEmpty() ? -1 : stack.peek();
				max = Math.max(max, heights [j] * (i - k - 1));
			}
			stack.push(i);
		}
		while(!stack.isEmpty()){
			int j = stack.pop();
			int k = stack.isEmpty() ? -1 : stack.peek();
			max = Math.max(max, heights [j] * (len - k - 1));
		}
		return max;
	}
}
