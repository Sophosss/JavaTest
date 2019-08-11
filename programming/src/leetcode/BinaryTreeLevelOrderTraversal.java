package leetcode;
import java.util.*;


public class BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer> > result = new ArrayList<>();
		if (root == null) return result;
		Deque<TreeNode> queue = new LinkedList<>();
		int count = 0;
		queue.push(root);
		while (!queue.isEmpty()) {
		    List<Integer> list = new ArrayList<>();
		    count = queue.size();
			for (int i = 0; i < count; i++) {
				TreeNode node = queue.poll();
				list.add(node.val);
				if (node.left != null) queue.add(node.left);
				if (node.right != null) queue.add(node.right);
			}
			result.add(list);
		}
		return result;
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(3);
		TreeNode node2 = new TreeNode(9);
		TreeNode node3 = new TreeNode(20);
		TreeNode node4 = new TreeNode(15);
		node1.left = node2;
		node1.right = node3;
		node3.left = node4;
		BinaryTreeLevelOrderTraversal binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();
		binaryTreeLevelOrderTraversal.levelOrder(node1);
	}
}
