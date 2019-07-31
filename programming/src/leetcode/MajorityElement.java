package leetcode;

public class MajorityElement {
	public int majorityElement(int[] nums) {
		int temp = 0;
		int sum = 0;
		for (int num : nums){
			if (sum == 0) {
				temp = num;
			}
			sum += temp == num ? 1 : -1;
		}
		return temp;
	}
}
