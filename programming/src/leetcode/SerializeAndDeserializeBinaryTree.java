package leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class SerializeAndDeserializeBinaryTree {
	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		if(root == null) return "#";
		return root.val + "," + serialize(root.left) + "," + serialize(root.right);
	}
	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		LinkedList<String> list = new LinkedList<>(Arrays.asList(data.split(",")));
		return helper(list);
	}
	public TreeNode helper(LinkedList<String> list){
		String s = list.poll();
		if("#".equals(s)) return null;
		TreeNode node = new TreeNode(Integer.valueOf(s));
		node.left = helper(list);
		node.right = helper(list);
		return node;
	}
}
