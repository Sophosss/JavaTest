package leetcode;

import java.util.HashMap;
import java.util.Map;

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

	//写法2
	public int lengthOfLongestSubstring2(String s) {
		Map<Character, Integer> map2 = new HashMap<>();
		int max = 0, start = 0, end = 0;
		char[] chars = s.toCharArray();
		for (char c : chars){
			if (map2.containsKey(c)){
				start = Math.max(start, map2.get(c));
			}
			map2.put(c, end+1);
			max = Math.max(max, end - start + 1);
			end++;
		}
		return max;
	}

	//写法3（滑动窗口模板）
	public int lengthOfLongestSubstring3(String s) {
		int len = s.length();
		Map<Character, Integer> window = new HashMap<>();
		int left = 0;
		int right = 0;
		int max = 0;
		while(right < s.length()){
			char c1 = s.charAt(right);
			window.put(c1, window.getOrDefault(c1, 0) + 1);
			right++;
			while(window.get(c1) > 1){
				char c2 = s.charAt(left);
				window.put(c2, window.get(c2) - 1);
				left++;
			}
			max = Math.max(max, right - left);
		}
		return max;
	}
}
