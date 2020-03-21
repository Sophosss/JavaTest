package newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ParcelInterval {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		char[] cs = s.toCharArray();
		Map<Character, Integer> have = new HashMap<Character, Integer> ();
		Map<Character, Integer> need = new HashMap<Character, Integer> ();
		for(char c : cs) need.put(c, need.getOrDefault(c, 0) + 1);
		int left = 0;
		int right = 0;
		int count = 0;
		List<Integer> list = new ArrayList<>();
		while(right < cs.length){
			char c1 = cs[right];
			if(!have.containsKey(c1)){
				count++;
				have.put(c1,1);
			}else have.put(c1, have.get(c1) + 1);
			need.put(c1, need.get(c1) - 1);
			if(need.get(c1) == 0) count--;
			right++;
			if(count == 0) list.add(right - left);
		}
		int cur = 0;
		for(int a : list){
			System.out.print(a - cur);
			System.out.print(" ");
			cur = a;
		}
	}
}
