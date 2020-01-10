package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlanticWaterFlow {
	int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
	int m, n;
	public List<List<Integer>> pacificAtlantic(int[][] matrix) {
		List<List<Integer>> list = new ArrayList<>();
		if(matrix.length == 0 || matrix[0].length == 0) return list;
		m = matrix.length;
		n = matrix[0].length;
		boolean[][] p = new boolean[m][n], a = new boolean[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(i == 0 || j == 0) dfs(matrix, i, j, p, matrix[i][j]);
				if(i == m-1 || j == n-1) dfs(matrix, i, j, a, matrix[i][j]);
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(p[i][j] && a[i][j]) list.add(Arrays.asList(i, j));
			}
		}
		return list;
	}
	private void dfs(int[][] matrix, int i, int j, boolean[][] v, int tmp){
		if(inArea(i, j) && !v[i][j] && matrix[i][j] >= tmp){
			v[i][j] = true;
			for (int k = 0; k < 4; k++) {
				dfs(matrix, i + dir[k][0], j + dir[k][1], v, matrix[i][j]);
			}
		}
	}
	private boolean inArea(int i, int j){
		return i >= 0 && i < m && j >= 0 && j < n;
	}
}
