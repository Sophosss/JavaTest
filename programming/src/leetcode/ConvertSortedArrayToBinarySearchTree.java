package leetcode;

public class ConvertSortedArrayToBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums == null || nums.length == 0) return null;
		return recur(nums, 0, nums.length -1);
	}
	public TreeNode recur(int []nums, int i, int j){
		if(i > j) return null;
		int mid = (i + j) >>> 1;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = recur(nums, i, mid - 1);
		root.right = recur(nums, mid + 1, j);
		return root;
	}
}
