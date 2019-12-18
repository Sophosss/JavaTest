package leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class SimplifyPath {
	public String simplifyPath(String path) {
		String[] strs = path.split("/");
		Deque<String> stack = new LinkedList<>();
		for(String str : strs){
			if(str.equals("..")){
				if(!stack.isEmpty()) stack.pop();
			}
			else if(!str.isEmpty() && !str.equals(".")) stack.push(str);
		}
		String s = "";
		for (String s1 : stack) s = "/" + s1 + s;
		return stack.isEmpty() ? "/" : s;
	}

	public static void main(String[] args) {
		SimplifyPath simplifyPath = new SimplifyPath();
		simplifyPath.simplifyPath("/home/pop");
	}
}
