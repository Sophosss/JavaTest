package leetcode;

public class FindWordsThatCanBeFormedByCharacters {
	public int countCharacters(String[] words, String chars) {
		int[] have = new int[26];
		for(char c : chars.toCharArray()) have[c - 'a']++;
		int cnt = 0;
		p : for(String word : words){
			int[] need = new int[26];
			for(char c : word.toCharArray()) need [c - 'a']++;
			for (int i = 0; i < 26; i++) {
				if(need[i] > have[i]) continue p;
			}
			cnt += word.length();
		}
		return cnt;
	}
}
