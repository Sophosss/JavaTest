package newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChessFlip {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String[]strs = s.split("],");
		for (int i = 0; i < strs.length; i++) {
			if(i == 0) strs[i] = strs[i].substring(2);
			else if(i == strs.length - 1) strs[i] = strs[i].substring(1, strs[i].length()-2);
			else strs[i] = strs[i].substring(1);
		}
		int[][] nums = new int[4][4];
		for (int i = 0; i < 4; i++) {
			String[] ss = strs[i].split(",");
			for (int j = 0; j < 4; j++) {
				nums[i][j] = Integer.parseInt(ss[j]);
			}
		}
		s = bf.readLine();
		String[] ss = s.split("],");
		for (int i = 0; i < ss.length; i++) {
			if(i == 0) ss[i] = ss[i].substring(2);
			else if(i == ss.length - 1) ss[i] = ss[i].substring(1, ss[i].length()-2);
			else ss[i] = ss[i].substring(1);
		}
		go(nums, ss);
		StringBuilder sb = new StringBuilder();
		sb.append("[[");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				sb.append(nums[i][j]);
				sb.append(",");
			}
			sb.deleteCharAt(sb.length()-1);
			sb.append("],[");
		}
		sb.delete(sb.length() - 2, sb.length());
		sb.append("]");
		System.out.println(sb.toString());
	}
	public static void go(int[][] nums, String[] ss){
		for (int i = 0; i < ss.length; i++) {
			int x = Integer.parseInt(ss[i].split(",")[0]) - 1;
			int y = Integer.parseInt(ss[i].split(",")[1]) - 1;
			if(x - 1 >= 0) nums[x-1][y] = Math.abs(nums[x-1][y] - 1);
			if(x + 1 <= 3) nums[x+1][y] = Math.abs(nums[x+1][y] - 1);
			if(y - 1 >= 0) nums[x][y-1] = Math.abs(nums[x][y-1] - 1);
			if(y + 1 <= 3) nums[x][y+1] = Math.abs(nums[x][y+1] - 1);
		}
	}
}
