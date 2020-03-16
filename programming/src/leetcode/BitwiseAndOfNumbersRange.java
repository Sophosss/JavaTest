package leetcode;

public class BitwiseAndOfNumbersRange {
	public int rangeBitwiseAnd(int m, int n) {
		int res = 0;
		for(; m != n; res++){
			m >>= 1;
			n >>= 1;
		}
		return m << res;
	}
}
