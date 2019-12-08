package leetcodeWeekly;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Two166 {
	public List<List<Integer>> groupThePeople(int[] groupSizes) {
		List<List<Integer>> list = new ArrayList<>();
		boolean[] v = new boolean[groupSizes.length];
		for(int i = 0; i < groupSizes.length; i++){
			if (v[i]) continue;
			List<Integer> l = new ArrayList<>();
			for (int j = 0; j < groupSizes.length; j++) {
				if (groupSizes[j] == groupSizes[i] && !v[j]){
					l.add(j);
					v[j] = true;
					if (l.size() == groupSizes[i]) {
						list.add(l);
						break;
					}
				}
			}
		}
		return list;
	}
	public static void main(String[] args) {
		Two166 two166 = new Two166();
		two166.groupThePeople(new int[]{3,3,3,3,3,1,3});
	}
}
