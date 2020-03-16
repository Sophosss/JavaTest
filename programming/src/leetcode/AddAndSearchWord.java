package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AddAndSearchWord {
	Map<Integer, Set<String>> map;
	public AddAndSearchWord() {
		map = new HashMap<>();
	}

	/** Adds a word into the data structure. */
	public void addWord(String word) {
		if(map.containsKey(word.length())) map.get(word.length()).add(word);
		else {
			HashSet<String> set = new HashSet<>();
			set.add(word);
			map.put(word.length(), set);
		}
	}

	/** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
	public boolean search(String word) {
		if(!map.containsKey(word.length())) return false;
		p : for(String s : map.get(word.length())){
			for (int i = 0; i < word.length(); i++) {
				if(word.charAt(i) == '.') continue;
				if(word.charAt(i) != s.charAt(i)) continue p;
			}
			return true;
		}
		return false;
	}
}
