package leetcode;

public class SplitArrayLargestSum {
	public int splitArray(int[] nums, int m) {
		int left = 0, right = 0;
		for(int num : nums){
			left = Math.max(left, num);
			right += num;
		}
		while(left < right){
			int mid = (left + right) >>> 1;
			int sum = 0, count = 1;
			for(int num : nums){
				sum += num;
				if(sum > mid){
					sum = num;
					count++;
				}
			}
			if(count > m) left = mid + 1;
			else right = mid;
		}
		return left;
	}
}
