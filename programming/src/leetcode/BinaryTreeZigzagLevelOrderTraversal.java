package leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		if(root == null) return list;
		Deque<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int depth = 0;
		while(!queue.isEmpty()){
			int count = queue.size();
			ArrayList<Integer> li = new ArrayList<>();
			while(count > 0){
				TreeNode node = queue.poll();
				if(depth % 2 == 0) li.add(node.val);
				else li.add(0, node.val);
				if(node.left != null) queue.add(node.left);
				if(node.right != null) queue.add(node.right);
				count--;
			}
			depth++;
			list.add(li);
		}
		return list;
	}
}
