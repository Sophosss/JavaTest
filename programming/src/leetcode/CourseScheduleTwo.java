package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CourseScheduleTwo {
	public int[] findOrder(int numCourses, int[][] prerequisites) {
		int[] nums = new int[numCourses];
		LinkedList<Integer> seq = new LinkedList<>();
		List<Integer> list = new ArrayList<>();
		for(int[] p : prerequisites) nums[p[0]]++;
		for(int i = 0; i < numCourses; i++){
			if(nums[i] == 0) seq.add(i);
		}
		while(!seq.isEmpty()){
			Integer first = seq.removeFirst();
			numCourses--;
			list.add(first);
			for(int[] p : prerequisites){
				if(p[1] != first) continue;
				if(--nums[p[0]] == 0) seq.add(p[0]);
			}
		}
		return numCourses == 0 ? list.stream().mapToInt(Integer::valueOf).toArray() : new int[]{};
	}
}
