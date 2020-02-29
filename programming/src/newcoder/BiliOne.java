package newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BiliOne {
	static int key = 0;
	static int len = Integer.MAX_VALUE;
	static String s = "";
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		key = Integer.parseInt(bf.readLine());
		dfs(0, new String());
		System.out.println(s);
	}
	public static void dfs(int val, String sb){
		if(val == key && sb.length() < len){
			len = sb.length();
			s = sb;
		}else if(val < key){
			dfs(val * 2 + 1, sb + "2");
			dfs(val * 2 + 2, sb + "3");
		}
	}
}
