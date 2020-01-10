package leetcode;
import java.util.*;

public class MinimumHeightTrees {
	public List<Integer> findMinHeightTrees(int n, int[][] edges) {
		List<Integer> list = new ArrayList<>();
		if(edges.length == 0 || edges[0].length == 0) {
			list.add(0);
			return list;
		}
		int[] degrees = new int[n];
		List<List<Integer>> map = new ArrayList<> ();
		for(int i = 0; i < n; i++) map.add(new ArrayList<>());
		for(int[] edge : edges){
			degrees[edge[0]]++;
			degrees[edge[1]]++;
			map.get(edge[0]).add(edge[1]);
			map.get(edge[1]).add(edge[0]);
		}
		LinkedList<Integer> queue = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			if(degrees[i] == 1) queue.add(i);
		}
		while(!queue.isEmpty()){
			list = new ArrayList<>();
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int tmp = queue.poll();
				list.add(tmp);
				List<Integer> l = map.get(tmp);
				for(int a : l){
					degrees[a]--;
					if(degrees[a] == 1) queue.add(a);
				}
			}
		}
		return list;
	}


	public static void main(String[] args) {
		MinimumHeightTrees minimumHeightTrees = new MinimumHeightTrees();
		minimumHeightTrees.findMinHeightTrees(4, new int[][]{{1,0},{1,2},{1,3}});
	}
}
