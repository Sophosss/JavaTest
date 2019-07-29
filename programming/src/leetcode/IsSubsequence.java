package leetcode;

public class IsSubsequence {
	public boolean isSubsequence(String s, String t) {
		int index = -1;
		for (char i : s.toCharArray()){
			index = t.indexOf(i, index + 1);
			if (index == -1){
				return false;
			}
		}
		return true;
	}
}
