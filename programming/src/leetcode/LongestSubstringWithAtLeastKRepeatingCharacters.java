package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtLeastKRepeatingCharacters {
	public int longestSubstring(String s, int k) {
		if(s == null || s.length() < k) return 0;
		if(k < 2) return s.length();
		return go(s.toCharArray(), 0, s.length(), k);
	}
	private int go(char[] chars, int left, int right, int k){
		if(right - left < k) return 0;
		int[] nums = new int[26];
		for (int i = left; i < right; i++) nums[chars[i] - 'a']++;
		for (int i = left; i < right; i++) {
			if(nums[chars[i] - 'a'] < k) return Math.max(go(chars, left, i, k), go(chars, i+1, right, k));
		}
		return right - left;
	}

	public static void main(String[] args) {
		LongestSubstringWithAtLeastKRepeatingCharacters l = new LongestSubstringWithAtLeastKRepeatingCharacters();
		l.longestSubstring("ababbc", 2);
	}
}
