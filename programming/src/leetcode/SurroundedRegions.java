package leetcode;

public class SurroundedRegions {
	public void solve(char[][] board) {
		if (board == null || board.length == 0 || board[0].length == 0) return;
		int m = board.length;
		int n = board[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(board[i][j] == 'O' && (i == 0 || i == m-1 || j == 0 || j == n-1)){
					dfs(board, i, j);
				}
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = board[i][j] == '#' ? 'O' : 'X';
			}
		}
	}
	private void dfs(char[][] board, int i, int j){
		if(i >= 0 && i < board.length && j >= 0 && j < board[0].length){
			if(board[i][j] == 'O'){
				board[i][j] = '#';
				dfs(board, i+1, j);
				dfs(board, i-1, j);
				dfs(board, i, j+1);
				dfs(board, i, j-1);
			}
		}
	}
}
