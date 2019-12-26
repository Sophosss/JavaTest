package leetcode;

import java.util.PriorityQueue;

public class FindMedianFromDataStream {
	PriorityQueue<Integer> min;
	PriorityQueue<Integer> max;
	public FindMedianFromDataStream() {
		min = new PriorityQueue<>();
		max = new PriorityQueue<>((o1, o2) -> o2 - o1);
	}
	public void addNum(int num) {
		if(max.isEmpty() || max.peek() > num) max.add(num);
		else min.add(num);
		hp(min, max);
	}
	public double findMedian() {
		int a = min.size();
		int b = max.size();
		if(a + b == 0) return 0;
		if(a == b) return (max.peek() + min.peek()) * 1.0 / 2;
		else return a > b ? min.peek() : max.peek();
	}
	private void hp(PriorityQueue<Integer> min, PriorityQueue<Integer> max){
		if(min.size() == max.size() + 2) max.add(min.poll());
		if(max.size() == min.size() + 2) min.add(max.poll());
	}
}
