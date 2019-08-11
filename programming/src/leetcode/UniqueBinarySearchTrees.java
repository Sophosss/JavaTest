package leetcode;

public class UniqueBinarySearchTrees {
	public int numTrees(int n) {
		int []arrs = new int [n+1];
		arrs[0] = 1;
		arrs[1] = 1;
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < i; j++ ){
				arrs[i] += arrs[j] * arrs[i-j-1];
			}
		}
		return arrs[n];
	}
}
