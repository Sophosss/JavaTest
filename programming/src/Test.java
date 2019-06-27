import java.util.*;

public class Test{

	public static void main(String[] args) {
		TreeMap<Integer,String> map = new TreeMap<>();
		HashSet hashSet = new HashSet();
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(5);
		ArrayList arrayList = new ArrayList();
		arrayList.add(3);
		arrayList.add(1);
		arrayList.add(8);
		arrayList.add(2);

		map.put(2,null);
		map.put(4,null);
		map.put(1,null);
		map.put(1,null);
		Object[] objects = map.keySet().toArray();
		int [] input = {8,2,1,5,4,9};
		List<Integer> list = new ArrayList<>();
		TreeMap treeMap = new TreeMap();
		int [][] array = new int[5][2];
//		System.out.println(array[0].length);

		treeMap.put(1,"2");
		treeMap.put(2,"3");
		treeMap.put(3,"4");
		treeMap.put(1,"3");
		list.add(1);
		list.add(2);
		list.add(6);
		list.add(4);
		list.add(5);
		Arrays.sort(input);
//		System.out.println(Collections.binarySearch(list,5));
//		System.out.println(Arrays.toString(input));
//		System.out.println(Collections.max(list));list
//		System.out.println(treeMap.get(1));
//		System.out.println(Arrays.binarySearch(objects,2));
//		System.out.println(map);
//		Collections.reverse(list);
//		System.out.println(list)
		Collections.sort(arrayList);
		System.out.println(arrayList);
	}
}
