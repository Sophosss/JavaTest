package leetcode;

public class CountNumbersWithUniqueDigits {
	public int countNumbersWithUniqueDigits(int n) {
		if(n == 0) return 1;
		if(n == 1) return 10;
		if(n > 10) n = 10;
		int res = 10;
		int dp = 9;
		for (int i = 2; i <= n; i++) {
			dp = dp * (11 - i);
			res += dp;
		}
		return res;
	}

	public static void main(String[] args) {
		CountNumbersWithUniqueDigits countNumbersWithUniqueDigits = new CountNumbersWithUniqueDigits();
		countNumbersWithUniqueDigits.countNumbersWithUniqueDigits(2);
	}
}
