package leetcode;

public class SortColors {
	public void sortColors(int[] nums) {
		int a = 0, b = 0;
		for(int num : nums){
			if (num == 0) a++;
			else if (num == 1) b++;
		}
		for (int i = 0; i < nums.length; i++) {
			if (a-- > 0) {nums[i] = 0;
			else if (b-- > 0) nums [i]  = 1;
			else nums[i] = 2;
		}
	}
}
