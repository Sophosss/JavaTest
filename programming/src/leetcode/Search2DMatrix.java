package leetcode;

public class Search2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix == null || matrix.length == 0) return false;
		int len1 = matrix.length;
		int len2 = matrix[0].length;
		for(int i = len1 - 1; i >= 0; i--){
			for(int j = 0; j < len2; j++){
				if(matrix[i][j] > target) continue;
				if(matrix[i][j] == target) return true;
			}
		}
		return false;
	}
}
