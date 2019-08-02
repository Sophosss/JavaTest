package leetcode;

public class RotateImage {

	//使用辅助矩阵
	public void rotate(int[][] matrix) {
		int n = matrix.length;
		int [][]arr = new int [n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++){
				//逆时针
				arr[i][j] = matrix [j][n - 1 - i];
				//顺时针
				arr[i][j] = matrix [n - 1 - j][i];
			}
		}
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				matrix [i] = arr[i];
			}
		}
	}

	//直接原矩阵修改
	public void rotate2(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n/2; i++){
			for (int j = i; j < n-1-i; j++){
				int temp = matrix [i][j];
				matrix [i][j] = matrix [n - 1 - j][i];
				matrix [n - 1 - j][i] = matrix [n - 1 - i][n - 1 -j];
				matrix [n - 1 - i][n - 1 -j] = matrix[j][n - 1 - i];
				matrix[j][n - 1 - i] = temp;
			}
		}
	}
}
