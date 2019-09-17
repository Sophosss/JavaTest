package leetcode;

public class BinaryTreeMaximumPathSum {
	int res = Integer.MIN_VALUE;
	public int maxPathSum(TreeNode root) {
		recur(root);
		return res;
	}
	private int recur(TreeNode root){
		if(root == null) return 0;
		int left = recur(root.left);
		int right = recur(root.right);
		res = Math.max(res, left + right + root.val);
		return Math.max(0, Math.max(left, right) + root.val);
	}
}
