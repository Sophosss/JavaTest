package leetcode;

public class SquaresOfASortedArray {
	public int[] sortedSquares(int[] A) {
		int m = A.length - 1;
		int l = 0;
		int r = m;
		int[] nums = new int[m+1];
		while (m >= 0){
			if(A[l]*A[l] < A[r]*A[r]){
				nums[m] = A[r]*A[r];
				r--;
			}else{
				nums[m] = A[l]*A[l];
				l++;
			}
			m--;
		}
		return nums;
	}
}
