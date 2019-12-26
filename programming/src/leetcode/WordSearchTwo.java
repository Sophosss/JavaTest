package leetcode;

import java.util.ArrayList;
import java.util.List;

public class WordSearchTwo {
	List<String> list = new ArrayList<>();
	public List<String> findWords(char[][] board, String[] words) {
		if(words == null || words.length == 0) return list;
		if(board == null || board.length == 0 || board[0].length == 0) return list;
		for(String word : words){
			if(ok(word, board)) list.add(word);
		}
		return list;
	}
	private boolean ok(String word, char[][] board){
		int m = board.length;
		int n = board[0].length;
		boolean[][] v = new boolean[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(board[i][j] == word.charAt(0) && dfs(board, word, 0, i, j, v)) return true;
			}
		}
		return false;
	}
	private boolean dfs(char[][] board, String word, int len, int i, int j, boolean[][] v){
		if(len == word.length()) return true;
		if(i<0 || i>= board.length || j<0 || j>=board[0].length || v[i][j] || board[i][j]!=word.charAt(len)) return false;
		v[i][j] = true;
		if(dfs(board,word,len+1,i+1,j,v) || dfs(board,word,len+1,i-1,j,v)
				|| dfs(board,word,len+1,i,j+1,v) || dfs(board,word,len+1,i,j-1,v)) return true;
		v[i][j] = false;
		return false;
	}
}
