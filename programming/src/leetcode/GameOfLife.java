package leetcode;

public class GameOfLife {
	public void gameOfLife(int[][] board) {
		if(board == null || board.length == 0 || board[0].length == 0) return;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = check(board, i, j);
			}
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = board[i][j] == 1 || board[i][j] == -2 ? 1 : 0;
			}
		}
	}
	private int check(int[][] board, int i ,int j){
		int count = 0;
		int ar = Math.max(0, i-1);
		int br = Math.min(board.length-1, i+1);
		int ac = Math.max(0, j-1);
		int bc = Math.min(board[0].length-1, j+1);
		for (int k = ar; k <= br; k++) {
			for (int l = ac; l <= bc; l++) {
				count += board[k][l] == 1 || board[k][l] == -1 ? 1 : 0;
			}
		}
		return board[i][j] == 1 ? (count == 3 || count == 4 ? 1 : -1) : (count == 3 ? -2 : 0);
	}

	public static void main(String[] args) {
		GameOfLife gameOfLife = new GameOfLife();
		gameOfLife.gameOfLife(new int[][]{{0,1,0},{0,0,1},{1,1,1},{0,0,0}});
	}
}
