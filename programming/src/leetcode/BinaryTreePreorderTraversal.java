package leetcode;
import java.util.*;

public class BinaryTreePreorderTraversal {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null) return list;
		Deque<TreeNode> queue = new LinkedList<> ();
		while (!queue.isEmpty() || root != null) {
			while (root != null){
				list.add(root.val);
				queue.push(root);
				root = root.left;
			}
			root = queue.pop().right;
		}
		return list;
	}
}
