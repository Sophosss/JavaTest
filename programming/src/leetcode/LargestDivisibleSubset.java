package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {
	List<Integer> list = new ArrayList<>();
	public List<Integer> largestDivisibleSubset(int[] nums) {
		if(nums == null || nums.length == 0) return list;
		int[] dp = new int[nums.length];
		int[] know = new int[nums.length];
		Arrays.sort(nums);
		Arrays.fill(dp, 1);
		Arrays.fill(know, -1);
		for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if(nums[i] % nums[j] == 0){
					if(dp[i] < dp[j] + 1){
						dp[i] = dp[j] + 1;
						know[i] = j;
					}
				}
			}
		}
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if(dp[i] > dp[index]){
				index = i;
			}
		}
		while(index != -1){
			list.add(nums[index]);
			index = know[index];
		}
		return list;
	}

	public static void main(String[] args) {
		LargestDivisibleSubset largestDivisibleSubset = new LargestDivisibleSubset();
		int[] dp = new int[]{1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384,32768,65536,131072,262144,524288,1048576,2097152,4194304,8388608,16777216,33554432,67108864,134217728,268435456,536870912,1073741824};
		System.out.println(dp.length);
	}
}
