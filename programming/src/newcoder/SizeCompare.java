package newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class SizeCompare {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		int n = Integer.parseInt(s);
		int[] nums = new int[n];
		int[] res = new int[n];
		Arrays.fill(res, -1);
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(bf.readLine());
		}
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < n; i++) {
			while(!stack.isEmpty() && nums[i] > nums[stack.peek()]){
				int j = stack.pop();
				res[j] = i - j;
			}
			stack.push(i);
		}
		for (int i = 0; i < n; i++) {
			System.out.println(res[i]);
		}
	}
}
