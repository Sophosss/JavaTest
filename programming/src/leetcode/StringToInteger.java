package leetcode;

public class StringToInteger {
	public int myAtoi(String str) {
		String s = str.trim();
		if("".equals(s)) return 0;
		int res = 0;
		boolean flag = true;
		if (s.charAt(0) == '-') {
			flag = false;
			s = s.substring(1);
		} else if(s.charAt(0) == '+'){
			s = s.substring(1);
		}
		int end = s.length();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < '0' || s.charAt(i) > '9'){
				end = i;
				break;
			}
		}
		if (end == 0) return 0;
		for (int i = 0; i < end; i++) {
			if (flag && (res > Integer.MAX_VALUE / 10 || res == Integer.MAX_VALUE / 10 && s.charAt(i) > '7')) return Integer.MAX_VALUE;
			if (!flag && (res > Integer.MAX_VALUE / 10 || res == Integer.MAX_VALUE / 10 && s.charAt(i) > '8')) return Integer.MIN_VALUE;
			res = res * 10 + Integer.parseInt(s.charAt(i)+"");
		}
		return flag ? res : -res;
	}

	public static void main(String[] args) {
		StringToInteger stringToInteger = new StringToInteger();
		stringToInteger.myAtoi("2147483646");
	}
}
