package leetcode;

public class isPalindrome {
	public boolean isPalindrome(int x) {
		String s = x + "";
		StringBuilder ss = new StringBuilder(s);
		ss.reverse();
		if(new String(ss).equals(s)){
			return true;
		}else {
			return false;
		}

	}
}
