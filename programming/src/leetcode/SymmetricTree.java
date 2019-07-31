package leetcode;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
public class SymmetricTree {

//	递归写法
//	public boolean isSymmetric(TreeNode root) {
//		if (root == null) return true;
//		return test(root.left, root.right);
//	}
//	public boolean test(TreeNode t1, TreeNode t2){
//		if (t1 == null && t2 == null) return true;
//		if (t1 == null || t2 == null) return false;
//		return (t1.val == t2.val) && test(t1.left, t2.right) && test(t1.right, t2.left);
//	}

	public boolean isSymmetric(TreeNode root) {
		if (root == null) return true;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root.left);
		queue.add(root.right);
		while (!queue.isEmpty()) {
			TreeNode t1 = queue.poll();
			TreeNode t2 = queue.poll();
			if (t1 == null && t2 == null) continue;
			if (t1 == null || t2 == null) return false;
			if (t1.val != t2.val) return false;
			queue.add(t1.left);
			queue.add(t2.right);
			queue.add(t1.right);
			queue.add(t2.left);
		}
		return true;
	}
}
