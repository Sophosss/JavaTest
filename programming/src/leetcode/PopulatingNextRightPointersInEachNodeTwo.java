package leetcode;

public class PopulatingNextRightPointersInEachNodeTwo {
	public Node5 connect(Node5 root) {
		if(root == null) return null;
		if(root.left != null){
			if(root.right != null) root.left.next = root.right;
			else root.left.next = go(root);
		}
		if(root.right != null){
			root.right.next = go(root);
		}
		connect(root.right);
		connect(root.left);
		return root;
	}
	private Node5 go(Node5 node){
		if(node.next == null) return null;
		while (node.next != null){
			if(node.next.left != null) return node.next.left;
			if(node.next.right != null) return node.next.right;
			node = node.next;
		}
		return null;
	}
}
