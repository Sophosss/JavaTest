package leetcode;

import java.util.Arrays;

public class TaskScheduler {
	public int leastInterval(char[] tasks, int n) {
		int []count = new int[26];
		for(char task : tasks) count[task - 'A'] += 1;
		Arrays.sort(count);
		int c = 0;
		for(int i = 25; i >= 0; i--){
			if(count[i] != count[25]) break;
			c++;
		}
		return Math.max((count[25] - 1) * (n + 1) + c, tasks.length);
	}

	public static void main(String[] args) {
		TaskScheduler taskScheduler = new TaskScheduler();
		taskScheduler.leastInterval(new char [] {'A','A','B','B'}, 0);
	}
}
