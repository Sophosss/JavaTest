package huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeSet;

public class MingRandom {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TreeSet<Integer> ts = new TreeSet<>();
		String co = "";
		while ((co = br.readLine())!=null) {
			int count = Integer.parseInt(co);
			while (count > 0) {
				int temp = Integer.parseInt(br.readLine());
				if (!ts.contains(temp)) {
					ts.add(temp);
				}
				count--;
			}

			Iterator<Integer> iterator = ts.iterator();
			while (iterator.hasNext()){
				int a = iterator.next();
				System.out.println(a);
			}
			ts.removeAll(ts);
		}
	}
}
