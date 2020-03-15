package atcoder;

import java.util.*;

public class G {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int n = in.nextInt();
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i <= k; i++) list.add(new ArrayList<>());
		int[] degrees = new int[k+1];
		for (int i = 0; i < n; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			list.get(a).add(b);
			degrees[b]++;
		}
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= k; i++) {
			if(degrees[i] == 0) queue.add(i);
		}
		int depth = -1;
		while(!queue.isEmpty()){
			depth++;
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int tmp = queue.poll();
				for(int node : list.get(tmp)){
					if(--degrees[node] == 0) queue.add(node);
				}
			}
		}
		System.out.println(depth);
	}
}
