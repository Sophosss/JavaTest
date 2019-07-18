package leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Combinations {
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		public List<List<Integer>> combine(int n, int k) {
			List<Integer> list = new ArrayList<>();
			add(n, k, 1, list);
			return result;
		}
		public void add(int n, int k, int start, List<Integer> list){
			if (k == 0){
				result.add(new ArrayList<>(list));
			}else {
				for (int i = start; i <= n ; i++) {
					list.add(i);
					add(n, k-1, i+1, list);
					list.remove(list.size()-1);
				}
			}
		}

	public static void main(String[] args) {
		Combinations combinations = new Combinations();
		List<List<Integer>> res = combinations.combine(4,2);
		Iterator<List<Integer>> iterator = res.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
