package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<>();
		while(matrix.length > 0){
			for(int temp : matrix[0]) list.add(temp);
			matrix = rotate(matrix);
		}
		return list;
	}
	private int[][] rotate(int [][]matrix){
		int [][]arrs = new int [matrix[0].length][matrix.length-1];
		for(int j = matrix[0].length - 1, m = 0; j >= 0; j--, m++){
			for(int i = 1, n = 0; i < matrix.length; i++, n++){
				arrs[m][n] = matrix[i][j];
			}
		}
		return arrs;
	}
}
