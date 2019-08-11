package leetcode;
import java.util.*;


public class BinaryTreePostorderTraversal {
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<> ();
		if (root == null) return list;
		Deque<TreeNode> stack = new LinkedList<>();
		while (!stack.isEmpty() || root != null){
			while (root != null){
				list.add(root.val);
				stack.push(root);
				root = root.right;
			}
			root = stack.pop().left;
		}
		Collections.reverse(list);
		return list;
	}
}
