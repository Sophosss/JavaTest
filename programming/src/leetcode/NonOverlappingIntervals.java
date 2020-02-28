package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NonOverlappingIntervals {
	public int eraseOverlapIntervals(int[][] intervals) {
		if(intervals.length == 0 || intervals[0].length == 0) return 0;
		Arrays.sort(intervals, (o1, o2) -> o1[1] - o2[1]);
		int loc = intervals[0][1];
		int count = 1;
		for(int[] num : intervals){
			if(num[0] >= loc){
				count++;
				loc = num[1];
			}
		}
		return intervals.length - count;
	}

	public static void main(String[] args) {
		NonOverlappingIntervals nonOverlappingIntervals = new NonOverlappingIntervals();
		nonOverlappingIntervals.eraseOverlapIntervals(new int[][]{{1,100},{11,22},{1,11},{2,12}});
	}
}
