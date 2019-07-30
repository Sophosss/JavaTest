package leetcode;

public class SingleNumber {
	public int singleNumber(int[] nums) {
		int temp = 0;
		for (int num : nums){
			temp ^= num;
		}
		return temp;
	}
}
