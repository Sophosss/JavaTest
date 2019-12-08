package leetcodeWeekly;

public class Three166 {
	public int smallestDivisor(int[] nums, int threshold) {
		int left = 1;
		int right = 1000000;
		while (left < right){
			int mid = left + (right - left) / 2;
			int tmp = 0;
			for(int a : nums){
				tmp += ((a%mid) == 0) ? a/mid : a/mid+1;
			}
			if(tmp <= threshold) right = mid;
			else left = mid + 1;
		}
		return left;
	}
}
