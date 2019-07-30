package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumCombinations {

	public List<String> letterCombinations(String digits) {
		if (digits.length() == 0) return new ArrayList<> ();
		HashMap<Integer, String> map = new HashMap<>();
		map.put(2,"abc");
		map.put(3,"def");
		map.put(4,"ghi");
		map.put(5,"jkl");
		map.put(6,"mno");
		map.put(7,"pqrs");
		map.put(8,"tuv");
		map.put(9,"wxyz");
		return letterCombinations(digits, map);
	}
	public List<String> letterCombinations(String digits, Map<Integer, String> map){
		List<String> now = new ArrayList<>();
		if (digits.length() == 1){
			int n = Integer.parseInt(digits);
			String str = map.get(n);
			for (int i = 0; i < str.length(); i++) {
				now.add("" + str.charAt(i));
			}
			return now;
		}
		List<String> pre = letterCombinations(digits.substring(1), map);
		String s = map.get(Integer.parseInt(digits.substring(0, 1)));
		for (int i = 0; i < pre.size(); i++) {
			for (int j = 0; j < s.length(); j++) {
				now.add(s.charAt(j) + pre.get(i));
			}
		}
		return now;
	}

	public static void main(String[] args) {
		PhoneNumCombinations pnc = new PhoneNumCombinations();
		pnc.letterCombinations("234");
	}
}
