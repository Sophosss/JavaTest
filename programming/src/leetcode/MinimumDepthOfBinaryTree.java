package leetcode;

import java.util.LinkedList;

public class MinimumDepthOfBinaryTree {
	public int minDepth(TreeNode root) {
		if(root == null) return 0;
		LinkedList<TreeNode> queue = new LinkedList<>();
		int dep = 0;
		queue.offer(root);
		while (!queue.isEmpty()){
			int count = queue.size();
			dep += 1;
			while (count > 0){
				TreeNode cur = queue.poll();
				if (cur.left == null && cur.right == null) return dep;
				if (cur.left != null) queue.offer(cur.left);
				if (cur.right != null) queue.offer(cur.right);
				count--;
			}
		}
		return dep;
	}
}
