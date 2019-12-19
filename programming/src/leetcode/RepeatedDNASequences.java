package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequences {
	public List<String> findRepeatedDnaSequences(String s) {
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		if(s == null || s.length() == 0) return new ArrayList<String>();
		for (int i = 0; i+10 <= s.length(); i++) {
			String cur = s.substring(i, i+10);
			if(!set1.contains(cur)) set1.add(cur);
			else set2.add(cur);
		}
		return new ArrayList<>(set2);
	}
}
