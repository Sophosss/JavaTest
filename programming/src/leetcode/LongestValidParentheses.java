package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class LongestValidParentheses {
	public int longestValidParentheses(String s) {
		int res = 0;
		Deque<Integer> stack = new LinkedList<>();
		stack.push(-1);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(0) == '(') stack.push(i);
			else {
				stack.pop();
				if (stack.isEmpty()) stack.push(i);
				else res = Math.max(res, i - stack.peek());
			}
		}
		return res;
	}

	public static void main(String[] args) {
		LongestValidParentheses longestValidParentheses = new LongestValidParentheses();
		longestValidParentheses.longestValidParentheses(")()())()()(");
	}
}
