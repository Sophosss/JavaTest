package leetcodeWeekly;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Four168 {
	public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
		Set<Integer> boxes = new HashSet<>();
		Set<Integer> key = new HashSet<>();
		LinkedList<Integer> queue = new LinkedList<>();
		for(int init : initialBoxes){
			if(status[init] == 1) queue.offer(init);
			else boxes.add(init);
		}
		int res = 0;
		while(!queue.isEmpty()){
			int tmp = queue.poll();
			res += candies[tmp];
			for(int b : containedBoxes[tmp]){
				if(status[b] == 1) queue.offer(b);
				else if(key.contains(b)){
					queue.add(b);
					boxes.remove(b);
				}
				else boxes.add(b);
			}
			for(int k : keys[tmp]){
				if(key.contains(k)) continue;
				if(boxes.contains(k)){
					boxes.remove(k);
					queue.offer(k);
				}
				else key.add(k);
			}
		}
		return res;
	}
}
