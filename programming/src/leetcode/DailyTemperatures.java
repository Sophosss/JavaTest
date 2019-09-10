package leetcode;

public class DailyTemperatures {
	public int[] dailyTemperatures(int[] T) {
		if(T == null || T.length == 0) return new int[]{};
		int n = T.length;
		int []nums = new int [n];
		for(int i = n - 2; i >= 0; i--){
			int count = 1;
			for(int j = i + 1; j < n; j++){
				if(T[j] > T[i]){
					nums[i] += count;
					break;
				}
				count++;
			}
		}
		return nums;
	}
}
