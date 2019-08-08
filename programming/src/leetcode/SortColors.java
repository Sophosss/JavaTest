package leetcode;

public class SortColors {

	public void sortColors(int[] nums) {
		int a = 0, b = 0;
		for(int num : nums){
			if (num == 0) a++;
			else if (num == 1) b++;
		}
		for (int i = 0; i < nums.length; i++) {
			if (a-- > 0) nums[i] = 0;
			else if (b-- > 0) nums [i]  = 1;
			else nums[i] = 2;
		}
	}

	//原地排序
	public void sortColors2(int[] nums) {
		int start = 0, cur = 0, end = nums.length - 1;
		while (cur <= end){
			if (nums [cur] == 2){
				swap(nums, cur, end);
				end--;
			}else if (nums [cur] == 0){
				swap(nums, start, cur);
				start++;
				cur++;
			}else cur++;
		}
	}
	public void swap(int [] nums, int i, int j){
		int temp = nums [i];
		nums [i] = nums [j];
		nums [j] = temp;
	}

	public static void main(String[] args) {
		int []nums = {2};
		SortColors sortColors = new SortColors();
		sortColors.sortColors2(nums);
	}
}

