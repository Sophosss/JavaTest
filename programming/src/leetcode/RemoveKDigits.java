package leetcode;

public class RemoveKDigits {
	public String removeKdigits(String num, int k) {
		if(num.length() == k) return "0";
		StringBuilder sb = new StringBuilder(num);
		for (int i = 0; i < k; i++) {
			int index = 0;
			for (int j = 1; j < sb.length() && sb.charAt(j) >= sb.charAt(j-1); j++) index = j;
			sb.deleteCharAt(index);
			while(sb.length() > 1 && sb.charAt(0) == '0') sb.deleteCharAt(0);
		}
		return sb.toString();
	}
}
