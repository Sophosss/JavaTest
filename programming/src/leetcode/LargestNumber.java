package leetcode;

import java.util.PriorityQueue;

public class LargestNumber {
	public String largestNumber(int[] nums) {
		if(nums == null || nums.length == 0) return "";
		PriorityQueue<String> queue = new PriorityQueue<>((o1, o2) -> (o2 + o1).compareTo((o1 + o2)));
		for(int n : nums) queue.add(n + "");
		StringBuilder sb = new StringBuilder();
		while(!queue.isEmpty()) sb.append(queue.poll());
		String s = sb.toString();
		return s.charAt(0) == '0' ? "0" : s;
	}
}
