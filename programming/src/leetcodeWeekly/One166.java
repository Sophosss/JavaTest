package leetcodeWeekly;

public class One166 {
	public int subtractProductAndSum(int n) {
		int t1 = 1;
		int t2 = 0;
		while (n != 0){
			int a = n % 10;
			t1 *= a;
			t2 += a;
			n /= 10;
		}
		return t1 - t2;
	}
}
