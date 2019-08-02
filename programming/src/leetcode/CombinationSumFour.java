package leetcode;

public class CombinationSumFour {
	public int combinationSum4(int[] nums, int target) {
		int []arr = new int[target + 1];
		arr[0] = 1;
		for (int i = 0; i <= target; i++){
			for (int j = 0; j < nums.length; j++){
				if (i - nums [j] >= 0){
					arr[i] += arr[i - nums [j]];
				}
			}
		}
		return arr[target];
	}
}
