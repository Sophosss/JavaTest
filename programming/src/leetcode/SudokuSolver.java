package leetcode;

public class SudokuSolver {
	public void solveSudoku(char[][] board) {
		boolean[][] row = new boolean[9][10];
		boolean[][] col = new boolean[9][10];
		boolean[][] have = new boolean[9][10];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if(board[i][j] != '.'){
					int num = board[i][j] - '0';
					row[i][num] = true;
					col[j][num] = true;
					have[i/3*3 + j/3][num] = true;
				}
			}
		}
		dfs(board, row, col, have, 0, 0);
	}
	private boolean dfs(char[][] board, boolean[][] row, boolean[][] col, boolean[][] have, int i, int j){
		while(board[i][j] != '.'){
			if(++j >= 9){
				j = 0;
				i += 1;
			}
			if(i >= 9) return true;
		}
		for (int k = 1; k <= 9; k++) {
			int tmp = i/3*3 + j/3;
			if(!row[i][k] && !col[j][k] && !have[tmp][k]){
				board[i][j] = (char)(k + '0');
				row[i][k] = true;
				col[j][k] = true;
				have[tmp][k] = true;
				if(dfs(board, row, col, have, i, j)) return true;
				else{
					board[i][j] = '.';
					row[i][k] = false;
					col[j][k] = false;
					have[tmp][k] = false;
				}
			}
		}
		return false;
	}
}
