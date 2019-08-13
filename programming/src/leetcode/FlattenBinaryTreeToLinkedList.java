package leetcode;

public class FlattenBinaryTreeToLinkedList {
	public void flatten(TreeNode root) {
		recur(root, null);
	}

	public TreeNode recur(TreeNode root, TreeNode p){
		if (root == null) return p;
		p = recur(root.right, p);
		p = recur(root.left, p);
		root.right = p;
		root.left = null;
		p = root;
		return p;
	}
}
