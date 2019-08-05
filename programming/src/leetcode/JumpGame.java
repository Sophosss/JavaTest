package leetcode;

public class JumpGame {
	public boolean canJump(int[] nums) {
		if (nums.length == 1) return true;
		int loc = 0;
		int nexloc = 0;
		for (int i = 0; i < nums.length; i++) {
			if(i > nexloc) return false;
			nexloc = Math.max(nexloc, nums[i] + i);
			if (nexloc >= nums.length - 1) return true;
			if (i == loc){
				loc = nexloc;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		JumpGame jg = new JumpGame();
		int []nums = {3,2,1,0,4};
		System.out.println(jg.canJump(nums));
	}
}
