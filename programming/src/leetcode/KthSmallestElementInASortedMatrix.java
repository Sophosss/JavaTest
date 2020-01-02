package leetcode;

public class KthSmallestElementInASortedMatrix {
	public int kthSmallest(int[][] matrix, int k) {
		int n = matrix.length;
		int left = matrix[0][0];
		int right = matrix[n-1][n-1];
		while(left < right){
			int mid = (left + right) >>> 1;
			int count = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if(matrix[i][j] > mid) break;
					count++;
				}
			}
			if(count < k) left = mid + 1;
			else right = mid;
		}
		return left;
	}
}
