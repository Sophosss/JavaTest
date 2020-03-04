package leetcode;

import java.util.LinkedList;

public class RottingOranges {
	public int orangesRotting(int[][] grid) {
		int sum = 0;
		int[][] dir = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
		LinkedList<int[]> queue = new LinkedList<>();
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if(grid[i][j] == 0) continue;
				if(grid[i][j] == 2) queue.add(new int[]{i, j});
				else sum++;
			}
		}
		int count = 0;
		while(!queue.isEmpty()){
			int size = queue.size();
			while(size-- > 0){
				int[] tmp = queue.poll();
				for (int i = 0; i < 4; i++) {
					int dx = tmp[0] + dir[i][0];
					int dy = tmp[1] + dir[i][1];
					if(dx>=0 && dx<grid.length && dy>=0 && dy<grid[0].length && grid[dx][dy] == 1){
						grid[dx][dy] = 2;
						queue.add(new int[]{dx, dy});
						sum--;
					}
				}
			}
			if(!queue.isEmpty()) count++;
		}
		return sum == 0 ? count : -1;
	}
}
