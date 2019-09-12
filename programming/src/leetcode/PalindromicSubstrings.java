package leetcode;

public class PalindromicSubstrings {
	int count = 0;
	public int countSubstrings(String s) {
		if(s == null || s.length() == 0) return 0;
		for(int i = 0; i < s.length(); i++){
			test(s, i, i);
			test(s, i, i + 1);
		}
		return count;
	}
	private void test(String s, int start, int end){
		while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
			count++;
			start--;
			end++;
		}
	}
}
