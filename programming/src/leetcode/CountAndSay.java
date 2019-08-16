package leetcode;

public class CountAndSay {
	public String countAndSay(int n) {
		String res = "1";
		for (int i = 0; i < n - 1; i++) {
			res = test(res);
		}
		return res;
	}
	private String test(String res) {
		String s = "";
		int i = 0;
		while (i < res.length()) {
			int count = 1;
			while (i < res.length() - 1 && res.charAt(i) == res.charAt(i+1)) {
				i++;
				count++;
			}
			s = s + count + "" + res.charAt(i);
			i++;
		}
		return s;
	}
}
