package leetcode;

import java.util.LinkedList;

public class BinarySearchTreeIterator {
	LinkedList<TreeNode> stack = new LinkedList<>();
	public BinarySearchTreeIterator(TreeNode root) {
		if(root == null) return;
		stack.push(root);
		while(root.left != null){
			stack.push(root.left);
			root = root.left;
		}
	}

	/** @return the next smallest number */
	public int next() {
		TreeNode node = stack.pop();
		if(node.right != null){
			stack.push(node.right);
			TreeNode tmp = node.right;
			while(tmp.left != null){
				stack.push(tmp.left);
				tmp = tmp.left;
			}
		}
		return node.val;
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		return !stack.isEmpty();
	}
}
