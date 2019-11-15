package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateSubtrees {
	Map<String, Integer> map = new HashMap<>();
	List<TreeNode> list = new ArrayList<>();
	public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
		serialize(root);
		return list;
	}
	public String serialize(TreeNode root){
		if(root == null) return " ";
		String left = serialize(root.left);
		String right = serialize(root.right);
		String key = root.val + left + right;
		map.put(key, map.getOrDefault(key, 0) + 1);
		if(map.get(key) == 2) list.add(root);
		return key;
	}
}
