package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreIn {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		int n = preorder.length;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(inorder[i], i);
		}
		return recur(preorder,0, n, inorder, 0, n, map);
	}

	private TreeNode recur(int [] preorder, int prestart, int preend, int [] inorder, int instart, int inend, Map<Integer, Integer> map) {
	    if (prestart == preend) return null;
	    TreeNode root = new TreeNode(preorder [prestart]);
	    int loc = map.get(preorder [prestart]);
	    root.left = recur(preorder, prestart + 1, prestart + 1 + loc - instart, inorder, instart, loc, map);
		root.right = recur(preorder, prestart + 1 + loc - instart, preend, inorder, loc + 1, inend, map);
		return root;
	}
}
