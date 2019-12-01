package leetcode;

public class NumberOfDigitOne {
	public int countDigitOne(int n) {
		if(n < 0) return 0;
		int count = 0;
		long tmp = 0;
		for (long i = 1; i <= n; i*=10) {
			tmp = i * 10;
			count += (n / tmp) * i + Math.min(i, Math.max(0, n % tmp - i + 1));
		}
		return count;
	}
}
