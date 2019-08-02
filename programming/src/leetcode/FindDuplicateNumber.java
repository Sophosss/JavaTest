package leetcode;

public class FindDuplicateNumber {
	public int findDuplicate(int[] nums) {
		int left = 1;
		int right = nums.length - 1;
		while (left < right){
			int mid  = (left + right) >>> 1;
			int count = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums [i] <= mid) count ++;
			}
			if (count > mid) right = mid ;
			else left = mid + 1;
		}
		return left;
	}

	public static void main(String[] args) {
		int []arr ={1,3,4,2,2};
		FindDuplicateNumber fdn = new FindDuplicateNumber();
		fdn.findDuplicate(arr);
	}
}
