package leetcode;

import java.util.Stack;

public class MinStack {

	/** initialize your data structure here. */
	private Stack<Integer> stack1;
	private Stack<Integer> stack2;
	public MinStack() {
		stack1 = new Stack<> ();
		stack2 = new Stack<> ();
	}

	public void push(int x) {
		stack1.push(x);
		if (stack2.isEmpty() || x <= stack2.peek()){
			stack2.push(x);
		}
	}

	public void pop() {
		int temp = stack1.pop();
		if (temp == stack2.peek()){
			stack2.pop();
		}
	}

	public int top() {
		return stack1.peek();
	}

	public int getMin() {
		return stack2.peek();
	}
}
