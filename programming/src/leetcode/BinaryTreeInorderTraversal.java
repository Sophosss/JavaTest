package leetcode;
import	java.util.HashMap.TreeNode;
import java.util.*;


public class BinaryTreeInorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<> ();
		if (root == null) return list;
		Deque<TreeNode> stack = new LinkedList<>();
		while (!stack.isEmpty() || root != null) {
		    while (root != null){
		    	stack.push(root);
		    	root = root.left;
			}
			TreeNode cur = stack.pop();
		    list.add(cur.val);
		    root = cur.right;
		}
		return list;
	}
}
