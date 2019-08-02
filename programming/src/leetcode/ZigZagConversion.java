package leetcode;

public class ZigZagConversion {
	public String convert(String s, int numRows) {
		int n = s.length();
		String ss = "";
		String []nums = new String [numRows];
		for (int i = 0; i < numRows; i++){
			nums[i] = "";
		}
		boolean flag = false;
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (j == 0) flag = !flag;
			nums[j] += "" + s.charAt(i);
			j += flag ? 1 : -1;
			if (j == numRows) flag = !flag;
		}
		for (String num : nums){
			ss += num;
		}
		return ss;
	}
}
