package leetcode;

public class MinimumPathSum {
	public int minPathSum(int[][] grid) {
		int [][]arrs = new int [grid.length][grid [0].length];
		arrs[0][0] = grid [0][0];
		for (int i = 1; i < grid.length; i++) {
			arrs[i][0] = arrs[i-1][0] + grid [i][0];
		}
		for (int i = 1; i < grid[0].length; i++) {
			arrs[0][i] = arrs[0][i-1] + grid [0][i];
		}
		for (int i = 1; i < grid.length; i++) {
			for (int j = 1; j < grid [0].length; j++) {
				arrs[i][j] = Math.min(arrs[i-1][j], arrs[i][j-1]) + grid[i][j];
			}
		}
		return arrs[grid.length - 1][grid[0].length - 1];
	}
}
