package leetcodeWeekly;

import java.util.Arrays;

public class Two15 {
	public int removeCoveredIntervals(int[][] intervals) {
		Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
		int c = 0;
		int tmp = intervals [0][1];
		for(int []a : intervals){
			if(a[1] <= tmp) continue;
			else{
				c++;
				tmp = a[1];
			}
		}
		return c;
	}
}
