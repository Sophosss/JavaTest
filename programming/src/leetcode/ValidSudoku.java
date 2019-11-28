package leetcode;

public class ValidSudoku {
	boolean flag = true;
	int[] nums = new int[9];
	public boolean isValidSudoku(char[][] board) {
		nums[0] = 0;
		nums[1] = 0;
		nums[2] = 0;
		nums[3] = 3;
		nums[4] = 3;
		nums[5] = 3;
		nums[6] = 6;
		nums[7] = 6;
		nums[8] = 6;
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				if(flag == false) return false;
				if(board[i][j] >= '0' && board[i][j] <= '9'){
					go(board, i, j);
				}
			}
		}
		return flag;
	}
	public void go(char[][] board, int r, int c){
		for(int i = 0; i < 9; i++){
			if(i == r) continue;
			if(board[i][c] == board[r][c]) {
				flag = false;
				return;
			}
		}
		for(int i = 0; i < 9; i++){
			if(i == c) continue;
			if(board[r][i] == board[r][c]) {
				flag = false;
				return;
			}
		}
		int a = nums[r];
		int b = nums[c];
		for(int i = a; i < a+3; i++){
			for(int j = b; j < b+3; j++){
				if(i == r && j == c) continue;
				if(board[i][j] == board[r][c]){
					flag = false;
					return;
				}
			}
		}
	}
}
