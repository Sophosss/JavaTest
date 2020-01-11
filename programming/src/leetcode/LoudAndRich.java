package leetcode;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LoudAndRich {
	int[] cache;
	public int[] loudAndRich(int[][] richer, int[] quiet) {
		cache = new int[quiet.length];
		Arrays.fill(cache, Integer.MAX_VALUE / 2);
		List<List<Integer>> map = new LinkedList<>();
		for (int i = 0; i < quiet.length; i++) map.add(new ArrayList<>());
		for(int[] rich : richer) map.get(rich[1]).add(rich[0]);
		int[] bra = new int[quiet.length];
		for (int i = 0; i < bra.length; i++) {
			bra[i] = calc(i, map, quiet);
		}
		return bra;
	}
	private int calc(int i, List<List<Integer>> map, int[] quiet){
		if(cache[i] != Integer.MAX_VALUE / 2) return cache[i];
		int res = i;
		for(int m : map.get(i)){
			int tmp = calc(m, map, quiet);
			if(quiet[tmp] < quiet[res]) res = tmp;
		}
		return cache[i] = res;
	}
}
