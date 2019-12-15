package leetcodeWeekly;

import java.util.LinkedList;

public class Four167 {
	private int[] dx = {0, 0, 1, -1};
	private int[] dy = {1, -1, 0, 0};
	public int shortestPath(int[][] grid, int k) {
		int m = grid.length;
		int n = grid[0].length;
		int[][][] dp = new int[m][n][k+1];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				for (int l = 0; l <= k; l++) {
					dp[i][j][l] = Integer.MAX_VALUE;
				}
			}
		}
		dp[0][0][grid[0][0]] = 0;
		LinkedList<int[]> queue = new LinkedList<>();
		queue.offer(new int[]{0, 0, grid[0][0]});
		int step = 0;
		while (!queue.isEmpty()){
			step = step + 1;
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int[] tmp = queue.poll();
				for (int j = 0; j < 4; j++) {
					int x = tmp[0] + dx[j];
					int y = tmp[1] + dy[j];
					if(x >=0 && y >= 0 && x < m && y < n){
						int nk = tmp[2] + grid[x][y];
						if(nk > k || step >= dp[x][y][nk]) continue;
						dp[x][y][nk] = step;
						queue.offer(new int[]{x, y, nk});
					}
				}
			}
		}
		int res = Integer.MAX_VALUE;
		for (int i = 0; i <= k; i++) {
			res = Math.min(res, dp[m-1][n-1][i]);
		}
		return res == Integer.MAX_VALUE ? -1 : res;
	}
}
