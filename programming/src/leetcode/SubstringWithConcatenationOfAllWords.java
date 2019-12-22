package leetcode;

import java.util.*;

public class SubstringWithConcatenationOfAllWords {
	public List<Integer> findSubstring(String s, String[] words) {
		List<Integer> list = new ArrayList<>();
		if(s == null || s.length() == 0 || words == null || words.length == 0) return list;
		int len1 = words[0].length();
		Map<String, Integer> map = new HashMap<>();
		for(String word : words) map.put(word, map.getOrDefault(word, 0) + 1);
		int len2 = len1 * words.length;
		for (int i = 0; i <= s.length() - len2; i++) {
			String s1 = s.substring(i, i + len2);
			Map<String, Integer> m = new HashMap<>(map);
			Set<String> set = m.keySet();
			boolean flag = true;
			for (int j = i; j < i + len2; j += len1) {
				String tmp = s.substring(j, j + len1);
				if(set.contains(tmp) && m.get(tmp) > 0){
					m.put(tmp, m.get(tmp) - 1);
					if(m.get(tmp) == 0) m.remove(tmp);
				}
				else {
					flag = false;
					break;
				}
			}
			if(flag) list.add(i);
		}
		return list;
	}

	public static void main(String[] args) {
		SubstringWithConcatenationOfAllWords s = new SubstringWithConcatenationOfAllWords();
		s.findSubstring("lingmindraboofooowingdingbarrwingmonkeypoundcake", new String[]{"fooo","barr", "wing", "ding", "wing"});
	}
}
