package leetcode;

import java.util.*;

public class CloneGraph {
	class Node {
		public int val;
		public List<Node> neighbors;

		public Node() {}

		public Node(int _val,List<Node> _neighbors) {
			val = _val;
			neighbors = _neighbors;
		}
	}
	public Node cloneGraph(Node node) {
		Map<Node, Node> map = new HashMap<>();
		LinkedList<Node> queue = new LinkedList<>();
		map.put(node, new Node(node.val, new ArrayList<>()));
		queue.offer(node);
		while (!queue.isEmpty()){
			Node cur = queue.poll();
			for(Node n : cur.neighbors){
				if(!map.containsKey(n)){
					map.put(n, new Node(n.val, new ArrayList<>()));
					queue.offer(n);
				}
				map.get(cur).neighbors.add(map.get(n));
			}
		}
		return map.get(node);
	}
}
