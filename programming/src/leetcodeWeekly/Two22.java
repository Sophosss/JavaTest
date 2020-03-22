package leetcodeWeekly;

public class Two22 {
	public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
		int roww = 0;
		for(int[] re : reservedSeats) roww = Math.max(roww, re[0]);
		boolean[] v = new boolean[roww];
		boolean[][] dp = new boolean[roww][10];
		for(int[] re : reservedSeats){
			int row = re[0] - 1;
			int col = re[1] - 1;
			dp[row][col] = true;
			v[row] = true;
		}
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if(n >= roww || !v[i]) {
				cnt += 2;
				continue;
			}
			for (int j = 1; j < 6;) {
				if(!dp[i][j] && !dp[i][j+1] && !dp[i][j+2] && !dp[i][j+3] && j != 2 && j != 4) {
					cnt++;
					j += 4;
				}else j += 1;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		Two22 two22 = new Two22();
		int[][] nums = new int[][]{{4,3},{1,4},{4,6},{1,7}};
		System.out.println(two22.maxNumberOfFamilies(4, nums));
	}
}
