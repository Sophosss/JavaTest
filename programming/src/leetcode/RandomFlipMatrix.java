package leetcode;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomFlipMatrix {
	int m;
	int n;
	int[][] nums;
	Set<Integer> set;
	int len;
	Random random;
	public RandomFlipMatrix(int n_rows, int n_cols) {
		this.m = n_rows;
		this.n = n_cols;
		nums = new int[m][n];
		len = m * n;
		random = new Random();
		set = new HashSet<>();
	}

	public int[] flip() {
		while(true){
			int a = random.nextInt(len);
			if(set.contains(a)) continue;
			int r = a / n;
			int c = a % n;
			set.add(a);
			return new int[]{r, c};
		}
	}

	public void reset() {
		set.clear();
	}
}
