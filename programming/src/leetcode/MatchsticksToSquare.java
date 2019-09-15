package leetcode;

public class MatchsticksToSquare {
	public boolean makesquare(int[] nums) {
		if(nums == null || nums.length == 0) return false;
		int sum = 0;
		for(int num : nums) sum += num;
		if(sum / 4 * 4 != sum) return false;
		return back(0, 0, 0, 0, sum/4, 0, nums);
	}
	private boolean back(int l1, int l2, int l3, int l4, int l5, int len, int []nums){
		if(len == nums.length){
			if(l1==l2 && l2==l3 && l3 ==l4 && l4 == l5) return true;
			else return false;
		}
		if(l1>l5 || l2>l5 || l3>l5 || l4>l5) return false;
		return back(l1+nums[len], l2, l3, l4, l5, len+1, nums) ||
				back(l1, l2+nums[len], l3, l4, l5, len+1, nums) ||
				back(l1, l2, l3+nums[len], l4, l5, len+1, nums) ||
				back(l1, l2, l3, l4+nums[len], l5, len+1, nums);
	}
}
