package leetcode;

public class ValidNumber {
	public boolean isNumber(String s) {
		// if(s.trim().contains("[^\\de-+.]")) return false;
		return s.trim().matches("([-+]?[0-9]+\\.?|[-+]?\\.?[0-9]+|[-+]?[0-9]+\\.[0-9]+)([eE][-+]?[0-9]+)?");
	}
}
