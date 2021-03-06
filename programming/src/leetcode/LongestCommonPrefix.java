package leetcode;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) return "";
		int len = Integer.MAX_VALUE;
		String ss = "";
		for(String s : strs){
			len = Math.min(len, s.length());
		}
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < strs.length - 1; j++) {
				if (strs[j].charAt(i) != strs[j+1].charAt(i)) return ss;
			}
			ss += strs[0].charAt(i);
		}
		return ss;
	}
}
