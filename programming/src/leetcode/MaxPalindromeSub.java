package leetcode;

public class MaxPalindromeSub {
	private int max;
	private int start;
	public String longestPalindrome(String s) {
		if (s.length() < 2){
			return s;
		}
		int n = s.length();
		for (int i = 0; i < n-1; i++) {
			find(s, i ,i);
			find(s, i ,i+1);
		}
		return s.substring(start,start + max);
	}
	private void find(String s, int a, int b){
		while (a>=0 && b < s.length() && s.charAt(a)==s.charAt(b)){
			a--;
			b++;
		}
		if (b - a - 1 > max){
			max = b - a - 1;
			start = a + 1;
		}
	}

	public static void main(String[] args) {
		MaxPalindromeSub mp = new MaxPalindromeSub();
		String ss = "ccc";
		String a = mp.longestPalindrome(ss);
		System.out.println(a);
	}
}
