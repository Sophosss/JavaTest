package leetcodeWeekly;

public class One169 {
	public int[] sumZero(int n) {
		int[] res = new int[n];
		for (int i = 0; i < n / 2; i++) {
			res[i * 2] = i + 1;
			res[i * 2 + 1] = -(i + 1);
		}
		return res;
	}
}
