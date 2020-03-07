package newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MeiTuanThree {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		while((s = bf.readLine()) != null){
			int n = Integer.parseInt(s);
			int[] nums = new int[2*n];
			for (int i = 0; i < 2*n-1; i+=2) {
				nums[i] = Integer.parseInt(bf.readLine());
			}
			for (int i = 1; i < 2*n; i+=2) {
				nums[i] = Integer.parseInt(bf.readLine());
			}
			for(int num : nums) System.out.println(num);
		}
	}
}
