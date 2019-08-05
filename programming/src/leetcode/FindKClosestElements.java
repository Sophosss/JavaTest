package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {
	public List<Integer> findClosestElements(int[] arr, int k, int x) {
		List<Integer> list = new ArrayList<>();
		int left = 0;
		int right = arr.length - k;
		while (left < right){
			int mid = (left + right) >>> 1;
			if (x - arr [mid] > arr[mid + k] - x){
				left = mid + 1;
			}else {
			    right = mid;
			}
		}
		for (int i = left; i < k; i++){
			list.add(arr [i]);
		}
		return list;
	}
}
