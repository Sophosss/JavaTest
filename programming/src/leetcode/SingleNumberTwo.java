package leetcode;

public class SingleNumberTwo {
	public int singleNumber(int[] nums) {
		int num1 = 0;
		for(int i = 0; i < 32; i++){
			int mask = 1 << i;
			int num2 = 0;
			for(int num : nums){
				if((num & mask) != 0) num2++;
			}
			if((num2 % 3) != 0) num1 |= mask;
		}
		return num1;
	}
}
