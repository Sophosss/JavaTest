package leetcode;
import java.util.*;

public class TopKFrequentElements {
	public List<Integer> topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<> ();
		PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());
		for(int num : nums){
			if (map.containsKey(num)) map.put(num, map.get(num) + 1);
			else map.put(num, 1);
		}
		queue.addAll(map.entrySet());
		for (int i = 0; i < k; i++) {
		    list.add(queue.poll().getKey());
		}
		return list;
	}
}
