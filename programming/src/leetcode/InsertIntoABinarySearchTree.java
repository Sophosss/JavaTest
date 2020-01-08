package leetcode;

public class InsertIntoABinarySearchTree {
	//递归
	public TreeNode insertIntoBST(TreeNode root, int val) {
		if(root == null) return new TreeNode(val);
		if(root.val > val) root.left = insertIntoBST(root.left, val);
		else root.right = insertIntoBST(root.right, val);
		return root;
	}
	//迭代
	public TreeNode insertIntoBST2(TreeNode root, int val) {
		if(root == null) return new TreeNode(val);
		TreeNode dummy = root;
		TreeNode cur = dummy;
		while(dummy != null){
			cur = dummy;
			if(dummy.val > val) dummy = dummy.left;
			else dummy = dummy.right;
		}
		if(cur.val > val) cur.left = new TreeNode(val);
		else cur.right = new TreeNode(val);
		return root;
	}
}
