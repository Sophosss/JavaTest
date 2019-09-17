package leetcode;

public class SingleNumberThree {
	public int[] singleNumber(int[] nums) {
		int res = 0;
		for(int num : nums){
			res ^= num;
		}
		res = res & -res;
		int num1 = 0;
		int num2 = 0;
		for(int num3 : nums){
			if((num3 & res) == 0) num1 ^= num3;
			else num2 ^= num3;
		}
		return new int[]{num1, num2};
	}
}
