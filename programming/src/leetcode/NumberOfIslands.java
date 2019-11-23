package leetcode;

public class NumberOfIslands {
	int m, n;
	int [][]arrs = new int [][]{{0,1}, {1,0}, {0,-1}, {-1,0}};
	public int numIslands(char[][] grid) {
		if(grid == null || grid.length == 0) return 0;
		int count = 0;
		m = grid.length;
		n = grid[0].length;
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(grid[i][j] == '1') {
					dfs(grid, i, j);
					count++;
				}
			}
		}
		return count;
	}
	public void dfs(char [][]grid, int i, int j){
		if(i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != '1') return;
		grid[i][j] = '2';
		for(int []arr : arrs) dfs(grid, i + arr[0], j + arr[1]);
	}
}
