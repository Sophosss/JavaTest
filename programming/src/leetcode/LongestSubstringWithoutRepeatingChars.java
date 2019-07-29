package leetcode;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChars {
	public int lengthOfLongestSubstring(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		int sum = 0;
		int n = s.length();
		for (int start = 0, end = 0; end < n; end++) {
			char temp = s.charAt(end);
			if (map.containsKey(temp)){
				start = Math.max(map.get(temp), start);
			}
			map.put(temp, end + 1);
			sum = Math.max(end - start + 1, sum);
		}
		return sum;
	}
}
