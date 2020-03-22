package leetcodeWeekly;
import java.util.Comparator;
import	java.util.PriorityQueue;

import java.util.PriorityQueue;

public class Three22 {
	public int getKth(int lo, int hi, int k) {
		PriorityQueue<int[]> queue = new PriorityQueue<>((o1,o2) -> o1[1] -  o2[1] == 0 ? o1[0] - o2[0] : o1[1] - o2[1]);
		for (int i = lo; i <= hi; i++) {
			int cnt = 0;
			int cur = i;
			while(cur != 1){
				cnt++;
				if(cur % 2 == 0) cur /= 2;
				else cur = 3 * cur + 1;
			}
			queue.add(new int[]{i, cnt});
		}
		int res = 0;
		for (int i = 0; i < k; i++) {
			res = queue.poll()[0];
		}
		return res;
	}

	public static void main(String[] args) {
		Three22 three22 = new Three22();
		System.out.println(three22.getKth(12, 15, 2));
	}
}
