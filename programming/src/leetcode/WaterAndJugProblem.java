package leetcode;
import java.util.LinkedList;
import	java.util.Queue;

public class WaterAndJugProblem {
	public boolean canMeasureWater(int x, int y, int z) {
		if(z == 0) return true;
		if(x < 0 || y < 0 || z < 0 || x + y < z) return false;
		int max = Math.max(x, Math.max(y, z));
		boolean[] v = new boolean[max+1];
		if(x + y == z) v[z] = true;
		Queue<Integer> queue = new LinkedList<>();
		queue.add(Math.abs(x - y));
		v[Math.abs(x - y)] = true;
		while(!queue.isEmpty()){
			int cur = queue.poll();
			if(cur + x == z || cur + y == z) return true;
			int tmp = Math.abs(x - cur);
			if(!v[tmp]){
				queue.add(tmp);
				v[tmp] = true;
			}
			tmp = Math.abs(y - cur);
			if(!v[tmp]){
				queue.add(tmp);
				v[tmp] = true;
			}
		}
		return v[z];
	}

	public static void main(String[] args) {
		WaterAndJugProblem waterAndJugProblem = new WaterAndJugProblem();
		waterAndJugProblem.canMeasureWater(34, 5, 6);
	}
}
