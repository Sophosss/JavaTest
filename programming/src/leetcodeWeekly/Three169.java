package leetcodeWeekly;

import java.util.HashSet;
import java.util.Set;

public class Three169 {
	boolean flag = false;
	public boolean canReach(int[] arr, int start) {
		if(arr == null || arr.length == 0) return false;
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		dfs(arr, start, start - arr[start], set1);
		dfs(arr, start, start + arr[start], set2);
		return flag;
	}
	private void dfs(int[] arr, int start, int next, Set<Integer> set){
		if(next >= arr.length || next < 0 || flag || set.contains(start)) return;
		if(arr[next] == 0){
			flag = true;
			return;
		}
		else{
			set.add(start);
			dfs(arr, next, next - arr[next], set);
			set.remove(next);
			dfs(arr, next, next + arr[next], set);
		}
	}

	public static void main(String[] args) {
		Three169 three169 = new Three169();
		three169.canReach(new int[]{4,4,1,3,0,3}, 2);
	}
}
