package newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MeiTuanOne {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		while((s = bf.readLine()) != null){
			char[] cs = s.toCharArray();
			String res = go(cs);
			System.out.println(res);
		}
	}
	public static String go(char[] cs){
		if(cs.length == 1) return String.valueOf(cs[0]);
		if(cs.length == 2){
			if(cs[0] == cs[1]) return "no";
			else return String.valueOf(cs);
		}
		StringBuilder sb = new StringBuilder();
		if(cs[0] != cs[1]) sb.append(cs[0]);
		for (int i = 1; i < cs.length - 1; i++) {
			if(cs[i] != cs[i-1] && cs[i] != cs[i+1]) sb.append(cs[i]);
		}
		if(cs[cs.length-1] != cs[cs.length-2]) sb.append(cs[cs.length-1]);
		return sb.toString().length() != 0 ? sb.toString() : "no";
	}
}
