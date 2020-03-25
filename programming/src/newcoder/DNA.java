package newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DNA {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String t = bf.readLine();
		int[] nums = new int[2];
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != t.charAt(i)){
				if(s.charAt(i) == 'A') nums[0]++;
				else nums[1]++;
			}
		}
		System.out.println(Math.max(nums[0], nums[1]));
	}
}
