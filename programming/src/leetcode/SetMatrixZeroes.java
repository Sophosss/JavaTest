package leetcode;

public class SetMatrixZeroes {
	int m, n;
	public void setZeroes(int[][] matrix) {
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
		m = matrix.length;
		n = matrix[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(matrix[i][j] == 0) dfs(matrix, i, j);
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = matrix[i][j] == Integer.MAX_VALUE/2 ? 0 : matrix[i][j];
			}
		}
	}
	private void dfs(int[][] matrix, int i, int j){
		for (int k = 0; k < m; k++) matrix[k][j] = matrix[k][j] != 0 ? Integer.MAX_VALUE/2 : 0;
		for (int k = 0; k < n; k++) matrix[i][k] = matrix[i][k] != 0 ? Integer.MAX_VALUE/2 : 0;
	}
}
