package leetcode;

import java.util.ArrayList;
import java.util.List;

public class WordBreakTwo {
	List<List<String>> list = new ArrayList<>();
	public List<String> wordBreak(String s, List<String> wordDict) {
		List<String> list1 = new ArrayList<> ();
		if(!wordB(s, wordDict)) return list1;
		for(String word : wordDict){
			if(s.indexOf(word) == 0) dfs(s, wordDict, new ArrayList<>(), word.length());
		}
		for(List<String> word : list){
			list1.add(String.join(" ", word));
		}
		return list1;
	}
	private void dfs(String s, List<String> wordDict, List<String> l, int len){
		if(s.length() == len && wordDict.contains(s)) {
			l.add(s);
			list.add(new ArrayList<>(l));
		}
		else{
			l.add(s.substring(0, len));
			for(String s1 : wordDict){
				if(s.substring(len).indexOf(s1) == 0) {
					dfs(s.substring(len), wordDict, l, s1.length());
					l.remove(l.size()-1);
				}
			}
		}
	}
	public boolean wordB(String s, List<String> wordDict) {
		int len = s.length();
		boolean []nums = new boolean [len+1];
		nums[0] = true;
		for(int i = 1; i <= len; i++){
			for(int j = 0; j <= i; j++){
				if(wordDict.contains(s.substring(j, i)) && nums[j]) nums[i] = true;
			}
		}
		return nums[len];
	}

	public static void main(String[] args) {
		WordBreakTwo wordBreakTwo = new WordBreakTwo();
		List<String> l = new ArrayList<>();
		l.add("apple");
		l.add("pen");
		l.add("applepen");
		l.add("pine");
		l.add("pineapple");
		wordBreakTwo.wordBreak("pineapplepenapple", l);
	}
}
