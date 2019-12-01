package leetcode;

import java.util.Stack;

public class ValidateStackSequences {
	public boolean validateStackSequences(int[] pushed, int[] popped) {
		if(pushed == null || popped == null || pushed.length != popped.length) return false;
		if(popped.length == 0 && pushed.length == 0) return true;
		Stack<Integer> stack = new Stack<>();
		int index = 0;
		for (int i = 0; i < pushed.length; i++) {
			stack.push(pushed[i]);
			while (!stack.isEmpty() && stack.peek() == popped[index]){
				stack.pop();
				index++;
			}
		}
		return stack.isEmpty();
	}
}
