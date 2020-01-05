package leetcode;
import	java.util.Map;

import java.util.*;

public class GetWatchedVideosByYourFriends {
	public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
		Set<Integer> set = new HashSet<>();
		List<String> list = new ArrayList<>();
		LinkedList<Integer> queue = new LinkedList<>();
		Map<String, Integer> map = new HashMap<>();
		queue.add(id);
		boolean[] v = new boolean[watchedVideos.size()];
		v[id] = true;
		while (!queue.isEmpty() && level > 0){
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int tmp = queue.poll();
				for(int a : friends[tmp]) {
					if(!v[a]) {
						queue.add(a);
						v[a] = true;
					}
				}
			}
			level--;
		}
		while (!queue.isEmpty()){
			int tmp = queue.poll();
			for (int i = 0; i < watchedVideos.get(tmp).size(); i++) {
				map.put(watchedVideos.get(tmp).get(i), map.getOrDefault(watchedVideos.get(tmp).get(i), 0) + 1);
			}
		}
		PriorityQueue<Map.Entry<String, Integer>> q =
				new PriorityQueue<>((o1, o2) -> o1.getValue().equals(o2.getValue()) ? o1.getKey().compareTo(o2.getKey())
						: o1.getValue() - o2.getValue());
		q.addAll(map.entrySet());
		while (!q.isEmpty()){
			list.add(q.poll().getKey());
		}
		return list;
	}

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("A");
		l1.add("B");
		ArrayList<String> l2 = new ArrayList<>();
		l2.add("C");
		ArrayList<String> l3 = new ArrayList<>();
		l3.add("B");
		l3.add("C");
		ArrayList<String> l4 = new ArrayList<>();
		l4.add("D");
		ArrayList<List<String>> l5 = new ArrayList<>();
		l5.add(l1);
		l5.add(l2);
		l5.add(l3);
		l5.add(l4);
		int[][] dp = new int[][]{{1,2}, {0,3}, {0,3}, {1,2}};
		GetWatchedVideosByYourFriends getWatchedVideosByYourFriends = new GetWatchedVideosByYourFriends();
		getWatchedVideosByYourFriends.watchedVideosByFriends(l5, dp, 0, 2);
	}
}
