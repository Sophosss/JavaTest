package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInString {
	public List<Integer> findAnagrams(String s, String p) {
		Map<Character, Integer> window = new HashMap<>();
		Map<Character, Integer> need = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		int len = s.length();
		for(char c : p.toCharArray()){
			need.put(c, need.getOrDefault(c, 0) + 1);
		}
		int left = 0;
		int right = 0;
		int count = 0;
		while(right < len){
			char c1 = s.charAt(right);
			if(need.containsKey(c1)){
				window.put(c1, window.getOrDefault(c1, 0) + 1);
				if(window.get(c1).equals(need.get(c1))) count++;
			}
			right++;
			while(count == need.size()){
				if(right - left == p.length()){
					list.add(left);
				}
				char c2 = s.charAt(left);
				if(need.containsKey(c2)){
					window.put(c2, window.get(c2) - 1);
					if(window.get(c2) < need.get(c2)){
						count--;
					}
				}
				left++;
			}
		}
		return list;
	}
}
