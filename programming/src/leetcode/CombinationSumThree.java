package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumThree {
	List<List<Integer>> list = new ArrayList<>();
	public List<List<Integer>> combinationSum3(int k, int n) {
		List<Integer> list1 = new ArrayList<> ();
		back(list1, 1, k, n);
		return list;
	}
	public void back(List<Integer>list1, int start, int count, int target){
		if (count == 0 && target == 0){
			list.add(new ArrayList<>(list1));
		}else {
			for (int i = start; i < 10; i++) {
				list1.add(i);
				back(list1, i + 1, count - 1, target -i);
				list1.remove(list1.size() - 1);
			}
		}
	}
}
