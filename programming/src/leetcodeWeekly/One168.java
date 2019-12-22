package leetcodeWeekly;

public class One168 {
	public int findNumbers(int[] nums) {
		String[] arrs = new String[nums.length];
		for (int i = 0; i < nums.length; i++) {
			arrs[i] = nums[i] + "";
		}
		int res = 0;
		for(String s : arrs){
			if(s.length() % 2 == 0) res += 1;
		}
		return res;
	}
}
