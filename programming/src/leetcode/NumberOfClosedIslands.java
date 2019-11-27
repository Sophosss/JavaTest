package leetcode;

public class NumberOfClosedIslands {
	int count = 0;
	int tmp = 0;
	int m, n;
	int [][]arrs = new int [][]{{0,1}, {1,0}, {0,-1}, {-1,0}};
	public int closedIsland(int[][] grid) {
		if(grid == null || grid.length == 0) return 0;
		m = grid.length;
		n = grid[0].length;
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(grid[i][j] == 0) {
					tmp = 1;
					dfs(grid, i, j);
					count += tmp;
				}
			}
		}
		return count;
	}
	public void dfs(int [][]grid, int i, int j){
		if(i < 0 || i == m || j < 0 || j == n) {
			tmp = 0;
			return;
		}
		if(grid[i][j] != 0) return;
		grid[i][j] = 1;
		for(int []arr : arrs) dfs(grid, i + arr[0], j + arr[1]);
	}
}
