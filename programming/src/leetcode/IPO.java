package leetcode;

import java.util.PriorityQueue;

class Node4{
	int p;
	int c;
	Node4(int p, int c){
		this.p = p;
		this.c = c;
	}
}

public class IPO {
	public int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
		Node4 []nodes = new Node4[Profits.length];
		for (int i = 0; i < Profits.length; i++) {
			nodes[i] = new Node4(Profits[i], Capital[i]);
		}
		PriorityQueue<Node4> min = new PriorityQueue<>((o1, o2) -> o1.c - o2.c);
		PriorityQueue<Node4> max = new PriorityQueue<>((o1, o2) -> o2.p - o1.p);
		for (int i = 0; i < Profits.length; i++) {
			min.add(nodes[i]);
		}
		for (int i = 0; i < k; i++) {
			while(!min.isEmpty() && min.peek().c <= W) max.add(min.poll());
			if(max.isEmpty()) return W;
			W += max.poll().p;
		}
		return W;
	}
}
