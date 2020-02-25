package newcoder;
import	java.util.ArrayList;
import	java.util.List;
import	java.util.HashSet;
import	java.util.HashMap;
import	java.util.Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

public class RemoveTheReportOfDisturbance {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] s1 = in.readLine().split(" ");
		int[] nums = new int[Integer.parseInt(s1[0])];
		String[] s = in.readLine().split(" ");
		int key = Integer.parseInt(s1[1]);
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(s[i]);
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer> ();
		Set<Integer> set = new HashSet<Integer> ();
		for(int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
			if(set.contains(num)) continue;
			if(map.get(num) > key){
				set.add(num);
			}
		}
		List<Integer> list = new ArrayList<Integer> ();
		for(int num : nums){
			if(set.contains(num)) continue;
			list.add(num);
		}
		for(int l : list) System.out.print(l + " ");
	}
}
