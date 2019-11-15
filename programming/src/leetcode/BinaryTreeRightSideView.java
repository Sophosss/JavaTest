package leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeRightSideView {
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if(root == null) return list;
		Deque<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int num = 0;
		while(!queue.isEmpty()){
			int count = queue.size();
			while(count > 0){
				TreeNode node = queue.poll();
				num = node.val;
				if(node.left != null) queue.add(node.left);
				if(node.right != null) queue.add(node.right);
				count--;
			}
			list.add(num);
		}
		return list;
	}
}
