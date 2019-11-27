package leetcode;

public class KthSmallestElementInBST {
	int i = 0;
	TreeNode p = null;
	public int kthSmallest(TreeNode root, int k) {
		if(root == null) return 0;
		go(root, k);
		return p.val;
	}
	public void go(TreeNode pRoot, int k){
		if(i > k || pRoot == null) return;
		go(pRoot.left, k);
		if(++i == k){
			p = pRoot;
			return;
		}
		go(pRoot.right, k);
	}
}
