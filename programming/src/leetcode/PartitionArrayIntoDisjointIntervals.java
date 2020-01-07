package leetcode;

import java.util.Stack;

public class PartitionArrayIntoDisjointIntervals {
	public int partitionDisjoint(int[] A) {
		int m = A.length;
		int res = 0;
		Stack<Integer> stack = new Stack<>();
		stack.push(Integer.MIN_VALUE);
		for(int i = 0; i < m; i++){
			boolean flag = true;
			if(A[i] > stack.peek()) {
				stack.push(A[i]);
			}
			res = i;
			for(int j = i + 1; j < m; j++){
				if(A[j] < stack.peek()){
					flag = false;
					break;
				}
			}
			if(flag) return res+1;
		}
		return m;
	}
}
