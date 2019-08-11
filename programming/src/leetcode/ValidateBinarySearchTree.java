package leetcode;


import java.util.ArrayList;

public class ValidateBinarySearchTree {
	public boolean isValidBST(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		recur(list, root);
		Integer[] integers = list.toArray(new Integer[0]);
		for (int i = 0; i < integers.length - 1; i++) {
			if (integers[i] > (integers[i + 1])) return false;
		}
		return true;
	}

	private void recur(ArrayList<Integer> list, TreeNode root) {
	    if (root == null) return;
	    else {
	    	recur(list, root.left);
	    	list.add(root.val);
	    	recur(list, root.right);
		}
	}
}
