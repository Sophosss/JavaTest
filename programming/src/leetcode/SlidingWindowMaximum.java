package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
	public int[] maxSlidingWindow(int[] nums, int k) {
		if(nums == null || nums.length < 2) return nums;
		Deque<Integer> queue = new LinkedList<>();
		int len = nums.length;
		int []arrs = new int [len-k+1];
		for(int i = 0; i < len; i++){
			while(!queue.isEmpty() && nums[queue.peekLast()] < nums[i]) queue.pollLast();
			queue.add(i);
			if(queue.peek() <= i - k) queue.poll();
			if(i - k + 1 >= 0) arrs[i-k+1] = nums[queue.peek()];
		}
		return arrs;
	}
}
