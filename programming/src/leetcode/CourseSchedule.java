package leetcode;

import java.util.LinkedList;

public class CourseSchedule {
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		LinkedList<Integer> seq = new LinkedList<>();
		int[] nums = new int[numCourses];
		for(int [] p : prerequisites) nums[p[0]]++;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) seq.add(i);
		}
		while (!seq.isEmpty()){
			Integer first = seq.removeFirst();
			numCourses--;
			for(int [] p : prerequisites){
				if(p[1] != first) continue;
				if(--nums[p[0]] == 0) seq.add(p[0]);
			}
		}
		return numCourses == 0;
	}
}
