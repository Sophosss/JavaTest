package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReorderedPowerOfTwo {
	public boolean reorderedPowerOf2(int N) {
		int[] nums = count(N);
		for (int i = 0; i < 31; ++i)
			if (Arrays.equals(nums, count(1 << i)))
				return true;
		return false;
	}
	public int[] count(int N) {
		int[] ans = new int[10];
		while (N > 0) {
			ans[N % 10]++;
			N /= 10;
		}
		return ans;
	}

	public static void main(String[] args) {
		ReorderedPowerOfTwo reorderedPowerOfTwo = new ReorderedPowerOfTwo();
		reorderedPowerOfTwo.reorderedPowerOf2(10);
	}
}
