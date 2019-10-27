package leetcode;

public class DiameterOfBinaryTree {
	int max = 0;
	public int diameterOfBinaryTree(TreeNode root) {
		recur(root);
		return max;
	}

	public int recur(TreeNode root){
		if(root == null) return 0;
		int left = recur(root.left);
		int right = recur(root.right);
		max = Math.max(max, left + right);
		return Math.max(left, right) + 1;
	}
}
