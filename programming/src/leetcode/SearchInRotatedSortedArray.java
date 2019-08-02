package leetcode;

public class SearchInRotatedSortedArray {
	public int search(int[] nums, int target) {
		if (nums == null || nums.length == 0) return -1;
		int left = 0;
		int right = nums.length - 1;
		while (left < right){
			int mid = (left + right + 1) >>> 1;
			if (nums[mid] > nums[left]){
				if (target >= nums [left] && target < nums [mid]){
					right = mid - 1;
				}else left = mid;
			}else {
				if (target >= nums [mid] && target <= nums [right]){
					left = mid;
				}else right = mid - 1;
			}
		}
		return  nums [right] == target ? right : -1;
	}

	public static void main(String[] args) {
		SearchInRotatedSortedArray sirsa = new SearchInRotatedSortedArray();
		int []array = {4,5,6,7,0,1,2};
		int a = sirsa.search(array, 7);
		System.out.println(a);
	}
}
