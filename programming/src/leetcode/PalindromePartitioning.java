package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
	List<List<String>> list = new ArrayList<>();
	public List<List<String>> partition(String s) {
		if(s == null || s.length() == 0) return list;
		dfs(new ArrayList<>(), s);
		return list;
	}
	private void dfs(List<String> l, String s){
		if(s.length() == 0) list.add(new ArrayList<>(l));
		else{
			for (int i = 1; i <= s.length(); i++) {
				if(ok(s, 0, i-1)){
					l.add(s.substring(0, i));
					dfs(l, s.substring(i));
					l.remove(l.size()-1);
				}
			}
		}
	}
	private boolean ok(String s, int a, int b){
		while (a++ < b--){
			if(s.charAt(a) != s.charAt(b)) return false;
		}
		return true;
	}
}
