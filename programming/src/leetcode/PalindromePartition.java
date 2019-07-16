package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromePartition {
	private String s;
	private int[][] arr = new int[700][700];

	public int minCut(String s) {
		this.s = s;
		for (int t = 0; t < s.length(); t++) {
			for (int i = 0, j = t; j < s.length(); i++, j++) {
				arr[i][j] = test(i, j);
			}
		}
		return arr[0][s.length() - 1];
	}

	private int test(int i, int j) {
		if (isPalindrome(i, j)) {
			return 0;
		}
		int min = s.length();
		for (int k = i; k < j; k++) {
			int a = arr[i][k];
			int b = arr[k + 1][j];
			a = a + b + 1;
			min = min > a ? a : min;
		}
		return min;
	}

	private boolean isPalindrome(int i, int j) {
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		while ((s = br.readLine()) != null) {
			PalindromePartition pp = new PalindromePartition();
			System.out.println(pp.minCut(s));
		}
	}
}
