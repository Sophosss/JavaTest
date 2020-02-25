package newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class GroupDialogue {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for (int i = 0; i < n; i++) {
			String[] s = in.readLine().split(" ");
			PriorityQueue<Integer> queue = new PriorityQueue<Integer> ((o1, o2) -> o2 -o1);
			for (int j = 1; j < s.length; j++) {
				int tmp = Integer.parseInt(s[j]);
				if(tmp > 0) queue.add(tmp);
			}
			int res = 0;
			while(queue.size() > 2){
				int a = queue.poll();
				int b = queue.poll();
				int c = queue.poll();
				res++;
				if(--a > 0) queue.add(a);
				if(--b > 0) queue.add(b);
				if(--c > 0) queue.add(c);
			}
			System.out.println(res);
		}
	}
}
