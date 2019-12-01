package leetcodeWeekly;

public class One165 {
	public String tictactoe(int[][] moves) {
		char [][]nums = new char[3][3];
		int k = 0;
		for(int [] move : moves){
			if(k % 2 == 0) nums[move[0]][move[1]] = 'X';
			else nums[move[0]][move[1]] = 'O';
			k++;
		}
		int i = 0;
		int j = 0;
		while(i < 3){
			if (nums[i][0] == nums[i][1] && nums[i][1] == nums[i][2]){
				if(nums[i][0] == 'X') return "A";
				if(nums[i][0] == 'O') return "B";
			}
			i++;
		}
		while(j < 3){
			if (nums[0][j] == nums[1][j] && nums[1][j] == nums[2][j]){
				if(nums[0][j] == 'X') return "A";
				if(nums[0][j] == 'O') return "B";
			}
			j++;
		}
		if(nums[0][0] == nums[1][1] && nums[2][2] == nums[1][1]){
			if(nums[0][0] == 'X') return "A";
			if(nums[0][0] == 'O') return "B";
		}
		if(nums[2][0] == nums[1][1] && nums[0][2] == nums[1][1]){
			if(nums[2][0] == 'X') return "A";
			if(nums[2][0] == 'O') return "B";
		}
		if(moves.length < 9) return "Pending";
		else return "Draw";
	}

	public static void main(String[] args) {
		One165 one165 = new One165();
		one165.tictactoe(new int [][]{{0,0}, {1,1}});
	}
}
