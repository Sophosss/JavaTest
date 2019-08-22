package leetcode;

public class DecodeWays {
	public int numDecodings(String s) {
		if(s.charAt(0) == '0') return 0;
		int []arrs = new int[s.length()+1];
		arrs[0] = arrs[1] = 1;
		for(int i = 2; i < s.length() + 1; i++){
			if(s.charAt(i-1) != '0') arrs[i] += arrs[i-1];
			if(s.charAt(i-2) == '1' || s.charAt(i-2) == '2' && s.charAt(i-1) <= '6') arrs[i] += arrs[i-2];
		}
		return arrs[arrs.length-1];
	}
}
