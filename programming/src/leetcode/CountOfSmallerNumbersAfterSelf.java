package leetcode;

import java.util.*;

class TreeArrs{
	private int len;
	private int[] nums;
	public TreeArrs(int n){
		this.len = n;
		nums = new int[n+1];
	}
	public int lowbits(int x){
		return x & (-x);
	}
	public void ins(int x, int val){
		while(x <= len){
			nums[x] += val;
			x += lowbits(x);
		}
	}
	public int query(int x){
		int res = 0;
		while (x > 0){
			res += nums[x];
			x -= lowbits(x);
		}
		return res;
	}
}
public class CountOfSmallerNumbersAfterSelf {
	public List<Integer> countSmaller(int[] nums) {
		List<Integer> list = new ArrayList<>();
		if(nums == null || nums.length == 0) return list;
		Set<Integer> set = new TreeSet<>();
		Map<Integer, Integer> map = new HashMap<>();
		for(int num : nums) set.add(num);
		int rank = 1;
		//离散化
		for(Integer a : set) map.put(a, rank++);
		TreeArrs treeArrs = new TreeArrs(nums.length+1);
		for (int i = nums.length - 1; i >= 0; i--) {
			rank = map.get(nums[i]);
			treeArrs.ins(rank, 1);
			list.add(treeArrs.query(rank - 1));
		}
		Collections.reverse(list);
		return list;
	}
}
