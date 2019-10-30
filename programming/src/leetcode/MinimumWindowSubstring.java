package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
	public String minWindow(String s, String t) {
		int len = s.length();
		Map<Character, Integer> window = new HashMap<>();
		Map<Character, Integer> need = new HashMap<>();
		for(char c : t.toCharArray()) need.put(c, need.getOrDefault(c, 0) + 1);
		int left = 0;
		int right = 0;
		int min = Integer.MAX_VALUE;
		int count = 0;
		int start = 0;
		while(right < s.length()){
			char c1 = s.charAt(right);
			if(need.containsKey(c1)){
				window.put(c1, window.getOrDefault(c1, 0) + 1);
				if(need.get(c1).equals(window.get(c1))) count++;
			}
			right++;
			while(count == need.size()){
				if(right - left < min){
					start = left;
					min = right - left;
				}
				char c2 = s.charAt(left);
				if(need.containsKey(c2)){
					window.put(c2, window.get(c2) - 1);
					if(window.get(c2) < need.get(c2)) count--;
				}
				left++;
			}
		}
		return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);
	}
}
