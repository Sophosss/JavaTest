package leetcode;
import	java.util.LinkedHashMap;

import java.util.Map;

public class LRUCache {
	private LinkedHashMap<Integer, Integer> map;
	public LRUCache(int capacity) {
		map = new LinkedHashMap(capacity, 0.75f, true){
			@Override
			protected boolean removeEldestEntry(Map.Entry eldest) {
				return size() > capacity;
			}
		};
	}

	public int get(int key) {
		return map.getOrDefault(key, -1);
	}

	public void put(int key, int value) {
		map.put(key, value);
	}
}
