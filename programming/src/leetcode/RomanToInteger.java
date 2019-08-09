package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	public int romanToInt(String s) {
		int sum = 0;
		Map<String,Integer> map = new HashMap<>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		map.put("IV", 4);
		map.put("IX", 9);
		map.put("XL", 40);
		map.put("XC", 90);
		map.put("CD", 400);
		map.put("CM", 900);
		for (int i = 0; i < s.length(); ) {
			if (i < s.length() - 1 && map.containsKey(s.substring(i, i+2))) {
				sum += map.get(s.substring(i, i+2));
				i += 2;
			}else {
				sum += map.get(s.substring(i, i+1));
				i += 1;
			}
		}
		return sum;
	}
}
