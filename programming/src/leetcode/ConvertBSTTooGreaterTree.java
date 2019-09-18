package leetcode;

public class ConvertBSTTooGreaterTree {
	public TreeNode convertBST(TreeNode root) {
		recur(root, 0);
		return root;
	}
	private int recur(TreeNode root, int temp){
		if(root == null) return temp;
		temp = recur(root.right, temp);
		int value = root.val;
		root.val += temp;
		temp += value;
		temp = recur(root.left, temp);
		return temp;
	}
}
