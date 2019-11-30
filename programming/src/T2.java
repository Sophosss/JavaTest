import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T2 {
	public static List<List<Integer>> removeInterval(int[][] intervals, int[] toBeRemoved) {
		List<List<Integer>> list = new ArrayList<>();
		int start, end;
		for(int[] num : intervals){
			start = num[0];
			end = num[1];
			if(num[1] <= toBeRemoved[0] || num[0] >= toBeRemoved[1]){
				list.add(Arrays.asList(start, end));
				continue;
			}
			if(num[0] >= toBeRemoved[0] && num[1] <= toBeRemoved[1]) continue;
			if(num[1] > toBeRemoved[1]) start = toBeRemoved[1];
			if(num[0] < toBeRemoved[0]) end = toBeRemoved[0];
			if(start < end) list.add(Arrays.asList(start, end));
			else {
				list.add(Arrays.asList(num[0], end));
				list.add(Arrays.asList(start, num[1]));
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int [][]arrs = new int[][]{{0,2},{3,4},{5,7}};
		int []arr = new int[]{1,6};
		T2.removeInterval(arrs, arr);
	}
}
