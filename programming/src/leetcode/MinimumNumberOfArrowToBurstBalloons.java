package leetcode;

import java.util.Arrays;

public class MinimumNumberOfArrowToBurstBalloons {
	public int findMinArrowShots(int[][] points) {
		if(points.length == 0 || points[0].length == 0) return 0;
		Arrays.sort(points, (o1, o2) -> o1[1] - o2[1]);
		int loc = points[0][1];
		int count = 1;
		for(int[] num : points){
			if(num[0] > loc){
				count++;
				loc = num[1];
			}
		}
		return count;
	}
}
