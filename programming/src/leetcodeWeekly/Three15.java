package leetcodeWeekly;

import java.util.ArrayList;
import java.util.List;

public class Three15 {
	List<List<Character>> list = new ArrayList<>();
	public Three15(String characters, int combinationLength) {
		add(characters.toCharArray(), combinationLength, 0, new ArrayList<>());
	}
	public void add(char[] nums, int k, int start, List<Character> l){
		if(k == 0) list.add(new ArrayList<>(l));
		else{
			for (int i = start; i < nums.length; i++) {
				l.add(nums[i]);
				add(nums, k-1, i+1, l);
				l.remove(l.size()-1);
			}
		}
	}

	public String next() {
		List<Character> remove = list.remove(0);
		StringBuilder sb = new StringBuilder();
		for( char c :remove) sb.append(c);
		return sb.toString();
	}

	public boolean hasNext() {
		return list.size() > 0 ? true : false;
	}

	public static void main(String[] args) {
		Three15 three15 = new Three15("abc", 2);
		String next = three15.next();
		String next1 = three15.next();
	}
}
