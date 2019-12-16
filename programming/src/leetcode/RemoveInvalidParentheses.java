package leetcode;

import java.util.*;

public class RemoveInvalidParentheses {
	public List<String> removeInvalidParentheses(String s) {
		List<String> list = new ArrayList<>();
		Set<String> set = new HashSet<>();
		LinkedList<String> queue = new LinkedList<>();
		if("".equals(s) || "()".equals(s)){
			list.add(s);
			return list;
		}
		queue.offer(s);
		boolean flag = false;
		while(!queue.isEmpty()){
			String cur = queue.poll();
			if(isValid(cur)){
				list.add(cur);
				flag = true;
			}
			if(flag) continue;
			for (int i = 0; i < cur.length(); i++) {
				if(cur.charAt(i) == ')' || cur.charAt(i) == '('){
					String tmp;
					if(i == cur.length() - 1) tmp = cur.substring(0, i);
					else tmp = cur.substring(0, i) + cur.substring(i+1);
					if(set.add(tmp)) queue.offer(tmp);
				}
			}
		}
		if(list.size() == 0) list.add("");
		return list;
	}
	private boolean isValid(String s){
		int left = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') left++;
			else if(s.charAt(i) == ')'){
				if(left != 0){
					left--;
				}else return false;
			}
		}
		return left == 0;
	}
}
