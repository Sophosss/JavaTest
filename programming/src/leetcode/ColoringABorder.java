package leetcode;

public class ColoringABorder {
	public int[][] colorBorder(int[][] grid, int r0, int c0, int color) {
		boolean[][] dp = new boolean[grid.length][grid[0].length];
		int tmp = grid[r0][c0];
		dfs(grid, dp, r0, c0, tmp);
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if(dp[i][j]){
					if(i == 0 || j == 0 || i == grid.length-1 || j == grid[0].length-1) grid[i][j] = color;
					else if(!(dp[i-1][j] && dp[i+1][j] && dp[i][j-1] && dp[i][j+1])) grid[i][j] = color;
				}
			}
		}
		return grid;
	}
	private void dfs(int[][] grid, boolean[][] dp, int i, int j, int tmp){
		if(i<0 || i >= grid.length || j < 0 || j >= grid[0].length || dp[i][j]) return;
		if(grid [i] [j] == tmp) {
			dp[i][j] = true;
			dfs(grid, dp, i+1, j, tmp);
			dfs(grid, dp, i-1, j, tmp);
			dfs(grid, dp, i, j+1, tmp);
			dfs(grid, dp, i, j-1, tmp);
		}
	}
}
