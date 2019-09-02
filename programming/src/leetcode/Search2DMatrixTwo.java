package leetcode;

public class Search2DMatrixTwo {
	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix == null || matrix.length == 0) return false;
		int len1 = matrix.length;
		int len2 = matrix[0].length;
		for(int i = len2 - 1; i >= 0; i--){
			for(int j = 0; j < len1; j++){
				if(matrix[j][i] > target) continue;
				if(matrix[j][i] == target) return true;
			}
		}
		return false;
	}
}
