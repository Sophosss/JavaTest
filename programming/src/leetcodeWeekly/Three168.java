package leetcodeWeekly;

import java.util.HashMap;
import java.util.Map;

public class Three168 {
	public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
		Map<String, Integer> map = new HashMap<>();
		int res = 0;
		for (int i = 0; i <= s.length() - minSize; i++) {
			String tmp = s.substring(i, i + minSize);
			boolean[] v = new boolean[26];
			for (int j = 0; j < tmp.length(); j++) v[tmp.charAt(j) - 'a'] = true;
			int c = 0;
			for (int j = 0; j < 26; j++) {
				if(v[j]) c++;
			}
			if(c <= maxLetters){
				map.put(tmp, map.getOrDefault(tmp, 0) + 1);
				res = Math.max(res, map.get(tmp));
			}
		}
		return res;
	}
}
