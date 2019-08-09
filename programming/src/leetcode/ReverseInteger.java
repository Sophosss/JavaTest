package leetcode;

public class ReverseInteger {
	public int reverse(int x) {
		int num = 0;
		while (x != 0){
			int temp = x % 10;
			if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10) && temp > 7) return 0;
			if (num < Integer.MIN_VALUE / 10 || (num == Integer.MIN_VALUE / 10) && temp < -8) return 0;
			num = num * 10 + temp;
			x /= 10;
		}
		return num;
	}
}
