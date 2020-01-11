package leetcode;

import java.util.LinkedList;
import java.util.List;

public class KeysAndRooms {
	public boolean canVisitAllRooms(List<List<Integer>> rooms) {
		LinkedList<Integer> queue = new LinkedList<>();
		boolean[] v = new boolean[rooms.size()];
		v[0] = true;
		for(int a : rooms.get(0)){
			queue.add(a);
			v[a] = true;
		}
		while(!queue.isEmpty()){
			int tmp = queue.poll();
			for(int a : rooms.get(tmp)){
				if(!v[a]) {
					queue.add(a);
					v[a] = true;
				}
			}
		}
		for(boolean a : v){
			if(!a) return false;
		}
		return true;
	}
}
