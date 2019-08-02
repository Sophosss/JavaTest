package leetcode;


public class HHH {
	public int searchInsert(int[] nums, int target) {
		int right = nums.length - 1;
		int left = 0;
		while (left < right) {
			int mid = (left + right) >>> 1;
			if (nums[mid] < target) {
				left = mid + 1;
			} else right = mid;
		}
		return nums[left] == target ? left : -1;
	}
//		while (left < right){
//			int mid = (left + right + 1) >>> 1;
//			if (nums [mid] > target){
//				right = mid - 1;
//			}else left = mid;
//		}
//		return nums [right] == target ? right : -1;
//	}

	public static void main(String[] args) {
		HHH hhh = new HHH();
		int [] nums = {1,2,2,2,2,2,2,2,3};
		System.out.println(hhh.searchInsert(nums, 0));

	}
}
