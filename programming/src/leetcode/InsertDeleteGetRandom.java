package leetcode;

import java.util.*;

public class InsertDeleteGetRandom {
	Map<Integer, Integer> map;
	List<Integer> list;
	public InsertDeleteGetRandom() {
		map = new HashMap<>();
		list = new ArrayList<>();
	}

	/** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
	public boolean insert(int val) {
		if(!map.containsKey(val)){
			map.put(val, list.size());
			list.add(val);
			return true;
		}else return false;
	}

	/** Removes a value from the set. Returns true if the set contained the specified element. */
	public boolean remove(int val) {
		if(map.containsKey(val)){
			int index = map.get(val);
			int num = list.get(list.size()-1);
			list.set(index, num);
			list.remove(list.size()-1);
			map.put(num, index);
			map.remove(val);
			return true;
		}else return false;
	}

	/** Get a random element from the set. */
	public int getRandom() {
		Random r = new Random();
		return list.get(r.nextInt(list.size()));
	}
}
