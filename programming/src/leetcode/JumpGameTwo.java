package leetcode;

public class JumpGameTwo {

	//动态规划，超时
	public int jump(int[] nums) {
		if (nums == null || nums.length == 0) return 0;
		int n = nums.length;
		int []arrs = new int [n];
		arrs[0] = 0;
		for (int i = 1; i < n; i++){
			arrs[i] = Integer.MAX_VALUE;
			for (int j = 0; j < i; j++) {
				if (nums [j] >= i - j){
					arrs[i] = Math.min(arrs[i], arrs[j] + 1);
				}
			}
		}
		return arrs[n - 1];
	}

	//贪心法 o(n^2)
	public int jump2(int[] nums) {
		if (nums == null || nums.length == 0) return 0;
		int n = nums.length - 1;
		int count = 0;
		while (n != 0) {
			for (int i = 0; i < n; i++) {
				if (nums[i] >= n - i){
					n = i;
					count ++;
					break;
				}
			}
		}
		return count;
	}

	//贪心法 o（n）
	public int jump3(int[] nums) {
		if (nums.length == 1) return 0;
		int loc = 0;
		int nexloc = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			nexloc = Math.max(nexloc, nums [i] + i);
			if (nexloc >= nums.length - 1) return count + 1;
			if (i == loc){
				loc = nexloc;
				count++;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		JumpGameTwo jg = new JumpGameTwo();
		int []nums = {2,3,1,1,4,2,1};
		System.out.println(jg.jump3(nums));
	}
}
