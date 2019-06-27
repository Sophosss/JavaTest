//class TreeNode {
//	int val;
//	TreeNode left;
//    TreeNode right;
//    TreeNode(int x) { val = x; }
//}
public class Solution {
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		return temp(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private TreeNode temp(int[] pre, int prestart, int preend, int[] in, int instart, int inend) {
		if (prestart > preend || instart > inend) {
			return null;
		}
		TreeNode treeNode = new TreeNode(pre[prestart]);
		for (int i = instart; i < inend; i++) {
			if (in[i] == pre[prestart]) {
				treeNode.left = temp(pre, prestart + 1, prestart + i - instart, in,instart,i-1 );
				treeNode.right = temp(pre,prestart + i - instart + 1, preend, in,i+1,inend );
			}

		}
		return treeNode;
	}
}

