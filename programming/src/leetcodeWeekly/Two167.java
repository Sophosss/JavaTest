package leetcodeWeekly;

import java.util.ArrayList;
import java.util.List;

public class Two167 {
	int[] nums = new int[]{
			12, 23, 34, 45, 56, 67, 78, 89,
			123, 234, 345, 456, 567, 678, 789,
			1234, 2345, 3456, 4567, 5678, 6789,
			12345, 23456, 34567, 45678, 56789,
			123456, 234567, 345678, 456789,
			1234567, 2345678, 3456789,
			12345678, 23456789,
			123456789
	};
	public List<Integer> sequentialDigits(int low, int high) {
		int left = findl(low);
		int right = findh(high);
		List<Integer> list = new ArrayList<>();
		for (int i = left; i <= right ; i++) {
			if(nums[i] > high || nums[i] < low) break;
			list.add(nums[i]);
		}
		return list;
	}
	public int findl(int low){
		int l = 0;
		int r = nums.length - 1;
		while (l < r) {
		    int mid = (l + r) >>> 1;
		    if(nums[mid] < low) l = mid + 1;
		    else r = mid;
		}
		return l;
	}
	public int findh(int high){
		int l = 0;
		int r = nums.length - 1;
		while (l < r){
			int mid = (l + r + 1) >>> 1;
			if(nums[mid] > high) r = mid - 1;
			else l = mid;
		}
		return l;
	}
}
