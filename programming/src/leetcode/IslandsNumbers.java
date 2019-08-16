package leetcode;

public class IslandsNumbers {
	public int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0) return 0;
		int [][]arrs = new int [][]{{1,0},{0,1},{-1,0},{0,-1}};
		int count = 0;
		boolean [][]visited = new boolean[grid.length][grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid [0].length; j++) {
				if (!visited[i][j] && grid[i][j] == '1'){
					dfs(grid, i, j, visited, arrs);
					count++;
				}
			}
		}
		return count;
	}
	private void dfs(char [] [] grid, int i, int j, boolean [] [] visited, int [][] arrs) {
	    visited [i] [j] = true;
		for (int k = 0; k < arrs.length; k++) {
			int ii = i + arrs[k][0];
			int jj = j + arrs[k][1];
			if (isArea(grid,ii,jj) && grid[ii][jj] == '1' && !visited[ii][jj]) dfs(grid, ii, jj, visited, arrs);
		}
	}
	private boolean isArea(char [][]grid, int i, int j){
		return i >=0 && i < grid.length && j >= 0 && j < grid [0].length;
	}
}
