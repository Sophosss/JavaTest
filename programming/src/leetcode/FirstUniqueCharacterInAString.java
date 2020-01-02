package leetcode;

public class FirstUniqueCharacterInAString {
	public int firstUniqChar(String s) {
		if(s == null || s.length() == 0) return 0;
		int[] nums = new int[26];
		for(int i = 0; i < s.length(); i++) nums[s.charAt(i) - 'a']++;
		for(int i = 0; i < s.length(); i++) {
			if(nums[s.charAt(i) - 'a'] == 1) return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		FirstUniqueCharacterInAString firstUniqueCharacterInAString = new FirstUniqueCharacterInAString();
		firstUniqueCharacterInAString.firstUniqChar("leetcode");
	}
}
