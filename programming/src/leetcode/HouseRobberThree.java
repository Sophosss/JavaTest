package leetcode;

public class HouseRobberThree {
	public int rob(TreeNode root) {
		int[]nums = dp(root);
		return Math.max(nums[0], nums[1]);
	}
	public int[] dp(TreeNode root){
		if(root == null) return new int[2];
		int[]left = dp(root.left);
		int[]right = dp(root.right);
		int[]nums = new int[2];
		//nums[0]表示不抢该节点可获得最大值,nums[1]表示抢劫该节点可获得最大值
		nums[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
		nums[1] = root.val + left[0] + right[0];
		return nums;
	}
}
