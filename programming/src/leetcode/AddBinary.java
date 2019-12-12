package leetcode;

public class AddBinary {
	public String addBinary(String a, String b) {
		int len1 = a.length();
		int len2 = b.length();
		StringBuilder sb = new StringBuilder();
		int res = 0;
		for(int i = len1-1, j = len2-1; i >= 0 || j >= 0; i--, j--){
			int tmp = res;
			tmp += i >= 0 ? a.charAt(i) - '0' : 0;
			tmp += j >= 0 ? b.charAt(j) - '0' : 0;
			sb.append(tmp % 2);
			res = tmp / 2;
		}
		if(res == 1) sb.append(1);
		return sb.reverse().toString();
	}
}
