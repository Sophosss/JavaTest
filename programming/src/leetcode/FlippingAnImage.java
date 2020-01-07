package leetcode;

public class FlippingAnImage {
	public int[][] flipAndInvertImage(int[][] A) {
		int m = A.length;
		int n = A[0].length;
		for(int i = 0; i < m; i++){
			for(int j = 0; j <= n/2; j++){
				swap(A, i, j, n-j-1);
			}
		}
		return A;
	}
	public void swap(int[][] nums, int i, int a, int b){
		if(a == b){
			nums[i][a] = Math.abs(nums[i][a] - 1);
			return;
		}
		else if(a < b){
			nums[i][a] = Math.abs(nums[i][a] - 1);
			nums[i][b] = Math.abs(nums[i][b] - 1);
			int tmp = nums[i][a];
			nums[i][a] = nums[i][b];
			nums[i][b] = tmp;
		}
	}
}
