package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromInPost {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		int n = inorder.length;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(inorder[i], i);
		}
		return recur(inorder, 0, n, postorder, 0, n, map);
	}

	private TreeNode recur(int[] inorder, int instart, int inend, int[] postorder, int poststart, int postend, Map<Integer,Integer> map){
		if (poststart == postend) return null;
		TreeNode root = new TreeNode(postorder[postend-1]);
		int loc = map.get(postorder[postend-1]);
		root.left = recur(inorder, instart, loc, postorder, poststart, poststart + loc - instart, map);
		root.right = recur(inorder, loc + 1, inend, postorder, poststart + loc - instart, postend - 1, map);
		return root;
	}
}
