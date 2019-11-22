package leetcode;

public class PermutationInString {
	public boolean checkInclusion(String s1, String s2) {
		if(s1 == null || s2 == null || s1.length() == 0 || s2.length() == 0) return false;
		int len1 = s1.length();
		int len2 = s2.length();
		int []c1 = getc(s1);
		for(int i = 0; i <= len2-len1; i++){
			int []c2 = getc(s2.substring(i, i+len1));
			if(ok(c1, c2)) return true;
		}
		return false;
	}
	public int [] getc(String s){
		int []nums = new int [26];
		for(char c : s.toCharArray()){
			nums[c - 'a'] += 1;
		}
		return nums;
	}
	public boolean ok(int[] c1, int [] c2){
		for(int i = 0; i < c1.length; i++){
			if(c1[i] != c2[i]) return false;
		}
		return true;
	}
}
