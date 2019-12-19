package leetcode;

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		if(s.trim().length() == 0) return true;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') sb.append(Character.toLowerCase(c));
			else if(c >= '0' && c <= '9') sb.append(c);
		}
		return ok(sb.toString());
	}
	private boolean ok(String s){
		int a = 0;
		int b = s.length() - 1;
		while (a < b){
			if(s.charAt(a) != s.charAt(b)) return false;
			a++;
			b--;
		}
		return true;
	}

	public static void main(String[] args) {
		ValidPalindrome validPalindrome = new ValidPalindrome();
		validPalindrome.isPalindrome("0P");
	}
}
