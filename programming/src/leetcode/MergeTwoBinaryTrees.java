package leetcode;

public class MergeTwoBinaryTrees {
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null) return t2;
		if (t2 == null) return t1;
		TreeNode t3 = new TreeNode(t1.val + t2.val);
		t3.left = mergeTrees(t1.left, t2.left);
		t3.right = mergeTrees(t1.right,t2.right);
		return t3;
	}
}
