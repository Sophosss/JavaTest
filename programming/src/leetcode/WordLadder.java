package leetcode;

import java.util.LinkedList;
import java.util.List;

public class WordLadder {
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		LinkedList<String> queue = new LinkedList<>();
		boolean[] v = new boolean[wordList.size()];
		int dep = 1;
		queue.offer(beginWord);
		while(!queue.isEmpty()){
			int c = queue.size();
			dep += 1;
			while (c-- > 0){
				String cur = queue.poll();
				for (int i = 0; i < wordList.size(); i++) {
					if(v[i]) continue;
					if(ok(cur, wordList.get(i))){
						if(wordList.get(i).equals(endWord)) return dep;
						queue.offer(wordList.get(i));
						v[i] = !v[i];
					}
				}
			}
		}
		return 0;
	}
	private boolean ok(String s1, String s2){
		int c = 0;
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) c++;
		}
		return c == 1;
	}
}
