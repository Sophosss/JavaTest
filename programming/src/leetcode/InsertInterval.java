package leetcode;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
	public int[][] insert(int[][] intervals, int[] newInterval) {
		int i = 0;
		List<int[]> list = new ArrayList<>();
		while(i < intervals.length && intervals[i][1] < newInterval[0]){
			list.add(intervals[i]);
			i++;
		}
		int start = newInterval[0];
		int end = newInterval[1];
		while(i < intervals.length && intervals[i][0] <= newInterval[1]){
			start = Math.min(start, intervals[i][0]);
			end = Math.max(end, intervals[i][1]);
			i++;
		}
		list.add(new int[]{start, end});
		while (i < intervals.length) {
			list.add(intervals[i]);
			i++;
		}
		return list.toArray(new int[0][]);
	}
}
