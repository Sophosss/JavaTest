package leetcode;

import java.util.Stack;

public class DailyTemperatures {
	public int[] dailyTemperatures(int[] T) {
		Stack<Integer> stack = new Stack<>();
		int[] nums = new int[T.length];
		for(int i = 0; i < T.length; i++){
			while(!stack.isEmpty() && T[stack.peek()] < T[i]){
				int j = stack.pop();
				nums[j] = i-j;
			}
			stack.push(i);
		}
		return nums;
	}
}
