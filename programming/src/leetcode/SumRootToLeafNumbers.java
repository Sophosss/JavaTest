package leetcode;

public class SumRootToLeafNumbers {
	int res = 0;
	public int sumNumbers(TreeNode root) {
		recur(root, 0);
		return res;
	}
	private void recur(TreeNode root, int temp){
		if(root == null) return;
		if(root.left == null && root.right == null) res += temp * 10 + root.val;
		recur(root.left, temp * 10 + root.val);
		recur(root.right, temp * 10 + root.val);
	}
}
