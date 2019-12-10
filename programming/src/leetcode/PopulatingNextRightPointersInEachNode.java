package leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Node5 {
	public int val;
	public Node5 left;
	public Node5 right;
	public Node5 next;

	public Node5() {}

	public Node5(int _val) {
		val = _val;
	}

	public Node5(int _val, Node5 _left, Node5 _right, Node5 _next) {
		val = _val;
		left = _left;
		right = _right;
		next = _next;
	}
};
public class PopulatingNextRightPointersInEachNode {
	public Node5 connect(Node5 root) {
		if(root == null) return null;
		if (root.left != null){
			root.left.next = root.right;
			if (root.next != null) root.right.next = root.next.left;
		}
		connect(root.left);
		connect(root.right);
		return root;
	}
}
