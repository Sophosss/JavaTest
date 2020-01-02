package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementOne {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<>();
		Stack<Integer> stack = new Stack<>();
		int[] dp = new int [nums1.length];
		for (int i = 0; i < nums2.length; i++) {
			while(!stack.isEmpty() && nums2[i] > nums2[stack.peek()]){
				int j = stack.pop();
				map.put(nums2[j], nums2[i]);
			}
			stack.push(i);
		}
		for (int i = 0; i < nums1.length; i++) {
			dp[i] = map.getOrDefault(nums1[i], -1);
		}
		return dp;
	}
}
