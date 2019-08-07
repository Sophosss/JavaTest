package leetcode;

import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.util.*;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List < String >> map = new HashMap<>();
		for (String str : strs){
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			String s = String.valueOf(chars);
			if (map.containsKey(s)){
				map.get(s).add(str);
			}else {
				map.put(s, new ArrayList<>());
				map.get(s).add(str);
			}
		}
//		System.out.println(map.values());
		return new ArrayList<>(map.values());
	}

	public static void main(String[] args) {
		GroupAnagrams groupAnagrams = new GroupAnagrams();
		String []ss = {"eat", "tea", "tan", "ate", "nat", "bat"};
		groupAnagrams.groupAnagrams(ss);

	}
}
