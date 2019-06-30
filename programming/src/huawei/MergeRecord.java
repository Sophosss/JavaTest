package huawei;

import java.util.*;

public class MergeRecord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		TreeMap<Integer,Integer> hashMap = new TreeMap<>();
		Deque deque = new LinkedList();
		for (int i = 0; i < n; i++) {
			int key = scanner.nextInt();
			int val = scanner.nextInt();
			if (hashMap.containsKey(key)){
				deque.add(key);
				int temp = hashMap.get(key);
				val = temp + val;
				hashMap.put(key,val);
			}else {
				hashMap.put(key,val);
			}
		}
		Object [] arr = hashMap.keySet().toArray();
		int count = hashMap.size();
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i] + " ");
			System.out.print(hashMap.get(arr[i]));
			System.out.println();
		}
	}
}
