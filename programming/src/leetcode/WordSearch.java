package leetcode;

public class WordSearch {
	public boolean exist(char[][] board, String word) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(0) && back(i, j, 0, word, board, new boolean[board.length][board[0].length])) return true;
			}
		}
		return false;
	}

	private boolean back(int i, int j, int len, String word, char[][] board, boolean[][] booleans) {
		if (len == word.length()) return true;
		if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || booleans[i][j] || board[i][j] != word.charAt(len)) return false;
		booleans[i][j] = true;
		if (back(i-1,j,len+1,word,board,booleans) || back(i+1,j,len+1,word,board,booleans)
				|| back(i,j-1,len+1,word,board,booleans) || back(i,j+1,len+1,word,board,booleans)) return true;
		booleans[i][j] = false;
		return false;
	}
}
