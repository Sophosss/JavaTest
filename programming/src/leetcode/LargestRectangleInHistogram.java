package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LargestRectangleInHistogram {
	public int largestRectangleArea(int[] heights) {
		if(heights == null || heights.length == 0) return 0;
		Stack<Integer> stack = new Stack<>();
		int max = 0;
		int len = heights.length;
		for(int i = 0; i < heights.length; i++){
			while(!stack.isEmpty() && heights [i] <= heights [stack.peek()]){
				int j = stack.pop();
				int k = stack.isEmpty() ? -1 : stack.peek();
				max = Math.max(max, heights [j] * (i - k - 1));
			}
			stack.push(i);
		}
		while(!stack.isEmpty()){
			int j = stack.pop();
			int k = stack.isEmpty() ? -1 : stack.peek();
			max = Math.max(max, heights [j] * (len - k - 1));
		}
		return max;
	}

	public static void main(String[] args) {
		LargestRectangleInHistogram largestRectangleInHistogram = new LargestRectangleInHistogram();
		largestRectangleInHistogram.largestRectangleArea(new int []{2,1,5,6,2,3});
	}
}
