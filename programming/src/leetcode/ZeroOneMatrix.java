package leetcode;

public class ZeroOneMatrix {
	public int[][] updateMatrix(int[][] matrix) {
		int[][] dp = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 1) matrix[i][j] = matrix.length + matrix[0].length;
				if(i > 0) matrix[i][j] = Math.min(matrix[i][j], matrix[i-1][j] + 1);
				if(j > 0) matrix[i][j] = Math.min(matrix[i][j], matrix[i][j-1] + 1);
			}
		}
		for (int i = matrix.length - 1; i >= 0; i--) {
			for (int j = matrix[0].length - 1; j >= 0; j--) {
				if(i < matrix.length - 1) matrix[i][j] = Math.min(matrix[i][j], matrix[i+1][j] + 1);
				if(j < matrix[0].length - 1) matrix[i][j] = Math.min(matrix[i][j], matrix[i][j+1] + 1);
			}
		}
		return matrix;
	}


	public static void main(String[] args) {
		ZeroOneMatrix zeroOneMatrix = new ZeroOneMatrix();
		zeroOneMatrix.updateMatrix(new int[][]{{0,0,0},{0,1,0},{1,1,1}});
		}
}

