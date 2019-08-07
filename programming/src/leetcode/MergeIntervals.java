package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
	public int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, (o1, o2) -> Integer.compare(o1[0], o2[0]));
		List < int [] > list = new ArrayList<>();
		int i = 0;
		while (i < intervals.length) {
			int a = intervals [i][0];
			int b = intervals [i][1];
			while (i < intervals.length - 1 && intervals [i + 1][0] <= b){
				b = Math.max(b, intervals [i + 1][1]);
				i++;
			}
			i++;
			list.add(new int[]{a,b});
		}
		return list.toArray(new int[0][]);
	}
}
