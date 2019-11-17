package leetcode;

public class UniquePathsTwo {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if(obstacleGrid == null || obstacleGrid.length == 0) return 0;
		int len1 = obstacleGrid.length;
		int len2 = obstacleGrid[0].length;
		int [][]nums = new int [len1][len2];
		nums[0][0] = obstacleGrid[0][0] == 0 ? 1 : 0;
		for(int i = 1; i < len2; i++){
			if(obstacleGrid[0][i] != 1) nums[0][i] = nums[0][i-1];
		}
		for(int j = 1; j < len1; j++){
			if(obstacleGrid[j][0] != 1) nums[j][0] = nums[j-1][0];
		}
		for(int i = 1; i < len1; i++){
			for(int j = 1; j < len2; j++){
				if(obstacleGrid[i][j] != 1) nums[i][j] = nums[i-1][j] + nums[i][j-1];
			}
		}
		return nums[len1-1][len2-1];
	}
}
