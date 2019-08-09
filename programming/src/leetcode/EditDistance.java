package leetcode;

public class EditDistance {
	public int minDistance(String word1, String word2) {
		int len1 = word1.length();
		int len2 = word2.length();
		int [][]nums = new int[len1+1][len2+1];
		for (int i = 0; i <= len1; i++) {
			nums[i][0] = i;
		}
		for (int i = 0; i <= len2; i++) {
			nums[0][i] = i;
		}
		for (int i = 1; i <= len1; i++) {
			for (int j = 1; j <= len2; j++) {
				if (word1.charAt(i-1) == word2.charAt(j-1)) nums[i][j] = nums[i-1][j-1];
				else nums[i][j] = Math.min(Math.min(nums[i-1][j], nums[i][j-1]),nums[i-1][j-1]) + 1;
			}
		}
		return nums[len1][len2];
	}
}
