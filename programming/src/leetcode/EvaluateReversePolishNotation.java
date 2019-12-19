package leetcode;

import java.util.Stack;

public class EvaluateReversePolishNotation {
	public int evalRPN(String[] tokens) {
		Stack<String> stack = new Stack<>();
		String s1, s2;
		for(String token : tokens){
			if(token.equals("+")) {
				s1 = stack.pop();
				s2 = stack.pop();
				stack.push(Integer.valueOf(s1) + Integer.valueOf(s2) + "");
			}else if(token.equals("-")){
				s1 = stack.pop();
				s2 = stack.pop();
				stack.push(Integer.valueOf(s2) - Integer.valueOf(s1) + "");
			}else if(token.equals("*")){
				s1 = stack.pop();
				s2 = stack.pop();
				stack.push(Integer.valueOf(s2) * Integer.valueOf(s1) + "");
			}else if(token.equals("/")){
				s1 = stack.pop();
				s2 = stack.pop();
				stack.push(Integer.valueOf(s2) / Integer.valueOf(s1) + "");
			}else stack.push(token);
		}
		return Integer.valueOf(stack.pop());
	}
}
